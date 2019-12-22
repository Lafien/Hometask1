package com.nefedov.controller;

import com.nefedov.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.io.IOException;

@Controller
public class UserController {

    @RequestMapping(value = { "/", "/welcome" }, method = RequestMethod.GET)
    public String index() {
        return "welcome";
    }

    @GetMapping("/user")
    public String userForm(Model model) {
        model.addAttribute("user", new User());
        return "user";
    }


    @RequestMapping(value="/user", method= RequestMethod.POST, params="action=save")
    public String save(@ModelAttribute User user, HttpServletResponse response) throws IOException {

        String str = user.getLastName() + " | " + user.getFirstName() + " | " + user.getSecondName() +
                " | " + user.getAge() + " | " + user.getSalary() + " | " + user.getEmail() + " | " + user.getPlaceOfWork() + "\n";

        FileOutputStream outputStream = new FileOutputStream("output.txt", true);
        byte[] strToBytes = str.getBytes();

        outputStream.write(strToBytes);
        outputStream.close();

        return "success";
    }





}
