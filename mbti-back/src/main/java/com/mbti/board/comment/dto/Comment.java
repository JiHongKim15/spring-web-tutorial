package com.mbti.board.comment.dto;

import lombok.Data;

import java.util.Date;

@Data
public class Comment {

    private int mainBoardNum;
    private String comment;
    private String writer;
    private Date writeTime;

}
