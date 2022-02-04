package com.mbti.board.mainBoard.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class MainBoard {

    private int mainBoardNum;
    private String content;
    private String writer;
    private Date writeTime;

}
