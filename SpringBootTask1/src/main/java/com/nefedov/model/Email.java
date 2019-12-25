package com.nefedov.model;

public class Email {
    private String emailFriend;
    private String textMessage;
    private String messageSubject;

    public Email(String emailFriend, String textMessage, String messageSubject) {
        this.emailFriend = emailFriend;
        this.textMessage = textMessage;
        this.messageSubject = messageSubject;
    }

    public String getMessageSubject() {
        return messageSubject;
    }

    public void setMessageSubject(String messageSubject) {
        this.messageSubject = messageSubject;
    }

    public Email() {
    }

    public String getEmailFriend() {
        return emailFriend;
    }

    public void setEmailFriend(String emailFriend) {
        this.emailFriend = emailFriend;
    }

    public String getTextMessage() {
        return textMessage;
    }

    public void setTextMessage(String textMessage) {
        this.textMessage = textMessage;
    }
}
