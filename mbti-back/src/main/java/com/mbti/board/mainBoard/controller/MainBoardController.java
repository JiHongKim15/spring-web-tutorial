package com.mbti.board.mainBoard.controller;

import com.mbti.board.mainBoard.dto.MainBoard;
import com.mbti.board.mainBoard.service.MainBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainBoardController {

    @Autowired
    private MainBoardService mainBoardSerivce;

    @GetMapping
    public List<MainBoard> loadMainBoardContent(){
        return mainBoardSerivce.loadMainBoardContent();
    }


    @PostMapping
    public int createMainBoardContent(MainBoard mainBoard){
        return mainBoardSerivce.createMainBoardContent(mainBoard);
    }

}
