package com.nefedov.controller;

import com.nefedov.model.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class EmailController {

    @Autowired
    public JavaMailSender emailSender;


    @RequestMapping(value = {"/sendmessage"}, method = RequestMethod.GET)
    public String sendmessage(Model model) {
        model.addAttribute("sendmessage", new Email());
        return "sendmessage";
    }


    @RequestMapping(value="/sendmessage", method= RequestMethod.POST, params="action=sendMessage")
    public String sendMessage(Email email){

        SimpleMailMessage message = new SimpleMailMessage();

        message.setTo(email.getEmailFriend());
        message.setSubject(email.getMessageSubject());
        message.setText(email.getTextMessage());

        this.emailSender.send(message);

        return "successemail";
    }













   /* @RequestMapping("/sendmessage")
    public String sendSimpleEmail() {

        // Create a Simple MailMessage.
        SimpleMailMessage message = new SimpleMailMessage();

        message.setTo(MyConstants.FRIEND_EMAIL);
        message.setSubject("Test Simple Email");
        message.setText("Hello, Im testing Simple Email");

        // Send Message!
        this.emailSender.send(message);

        return "successemail";
    }*/

}
