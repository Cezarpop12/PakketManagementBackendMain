package com.Code.Pakket.management.model;

public class HerinneringMessage {

    private String message;

    public HerinneringMessage(String Message){
        this.message = Message;
    }

    public HerinneringMessage(){
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
