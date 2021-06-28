package com.example.demorabbit.sample.model;


import java.io.Serializable;

public class Email implements Serializable {

    private String address;
    private String content;

    public Email() {
    }

    public Email(String address, String content) {
        this.address = address;
        this.content = content;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}