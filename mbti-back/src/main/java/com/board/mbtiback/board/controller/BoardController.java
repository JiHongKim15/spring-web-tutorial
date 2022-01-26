package com.board.mbtiback.board.controller;

import com.board.mbtiback.board.dto.boardDTO;
import com.board.mbtiback.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping
    public List<boardDTO> retrieveBoardList(){
        return boardService.retrieveBoardList();
    }
}
