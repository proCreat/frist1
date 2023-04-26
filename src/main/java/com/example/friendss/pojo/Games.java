package com.example.friendss.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Games implements Serializable {
    private int id;
    private int status;
    private String text;
    private String keyword;
    private String user_name;
    private String address;
    private int star;
}