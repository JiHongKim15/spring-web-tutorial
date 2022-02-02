package com.mbti.board.mainBoard.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
public class MainBoard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mainBoardNum;

    private String title;
    private String content;
    private String writer;
    private Date writeTime;

}
