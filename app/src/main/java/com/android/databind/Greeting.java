package com.android.databind;

import androidx.databinding.BaseObservable;


public class Greeting extends BaseObservable {
    private String senderName;
    private String greetingText;


    public Greeting() {
    }


    public Greeting(String senderName, String greetingText) {
        this.senderName = senderName;
        this.greetingText = greetingText;
    }


    public void setSenderName(String senderName) {
        this.senderName = senderName;

    }

    public String getGreetingText() {
        return greetingText;
    }

    public void setGreetingText(String greetingText) {
        this.greetingText = greetingText;

    }
    public String getSenderName() {
        return senderName;
    }





}
