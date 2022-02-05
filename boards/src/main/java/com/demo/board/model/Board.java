package com.demo.board.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Board {
    @Id //pk
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto Increase
    private Long bid;
    private String title;
    private String date;
    private String content;
    @ManyToOne
    @JoinColumn(name="uid", referencedColumnName = "uid", nullable = true)
    private User user;
}
