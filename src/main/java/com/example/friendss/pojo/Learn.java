package com.example.friendss.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Learn implements Serializable {
    private int id;
    private int sign;
    private String text;
    private String keyword;
    private String user_name;
    private String address;
    private int star;
}
