package com.demo.board.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Comment {
    @Id //pk
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto Increase
    private Long cid;
    private String content;
    private String date;
    @ManyToOne
    @JoinColumn(name="uid", referencedColumnName = "uid", nullable = true)
    private User user;
    @OneToMany
    @JoinColumn(name="bid", referencedColumnName = "bid", nullable = true)
    private Board board;
}
