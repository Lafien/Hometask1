package com.nefedov.controller;

import com.nefedov.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

@Controller
public class UserController {

    @RequestMapping(value = { "/", "/welcome" }, method = RequestMethod.GET)
    public String welcome() {
        return "welcome";
    }

    @RequestMapping(value = {"/search" }, method = RequestMethod.GET)
    public String search(Model model) {
        model.addAttribute("user", new User());
        return "search";
    }

    @GetMapping("/user")
    public String userForm(Model model) {
        model.addAttribute("user", new User());
        return "user";
    }

    @RequestMapping(value="/user", method= RequestMethod.POST, params="action=save")
    public String save(@Valid User user, BindingResult bindingResult) throws IOException {
        if (bindingResult.hasErrors()) {

            return "user";
        }
        else {
            String str = user.getLastName() + " " + user.getFirstName() + " " + user.getSecondName() +
                    " " + user.getAge() + " " + user.getSalary() + " " + user.getEmail() + " " + user.getPlaceOfWork() + "\n";

            FileOutputStream outputStream = new FileOutputStream("output.txt", true);
            byte[] strToBytes = str.getBytes();

            outputStream.write(strToBytes);
            outputStream.close();

            return "redirect:/user";
        }

    }

    @RequestMapping(value="/search", method= RequestMethod.GET, params="action=search")
    public String search(User user, BindingResult bindingResult) throws IOException {

        LinkedList<ArrayList<String>> list = new LinkedList<ArrayList<String>>();
        FileInputStream fileInputStream = new FileInputStream("output.txt");
        BufferedReader in = new BufferedReader(new InputStreamReader(fileInputStream));
        String str = null;
        ArrayList<String> result = null;
        while ((str = in.readLine()) != null) {
            String arr[] = str.split("\n");
            result = new ArrayList<String>(Arrays.asList(arr));
            list.addLast(result);
        }

        System.out.println(user.getLastName() + " " + user.getFirstName());
        String find ="";
        for(int i =0; i < list.size(); i++){
            if(list.get(i).toString().contains(user.getLastName()) && list.get(i).toString().contains(user.getFirstName())){
                //System.out.println(list.get(i));
                find = list.get(i).toString();
            }
        }

        find = find.replaceAll("\\[", "");
        find = find.replaceAll("\\]", "");
        String[] subStr;
        String delimeter = " ";
        subStr = find.split(delimeter);

        for(int i =0; i < subStr.length; i++){
            System.out.println(subStr[i]);
        }

        user.setSecondName(subStr[2]);
        user.setAge(Integer.parseInt(subStr[3]));
        user.setEmail(subStr[5]);
        user.setPlaceOfWork(subStr[6]);
        user.setSalary(Integer.parseInt(subStr[4]));

        return "result";
    }





}
