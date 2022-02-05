package com.demo.board.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class User {
    @Id //pk
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto Increase
    private Long uid;
    private String password;
    private String name;
    private String email;
}
