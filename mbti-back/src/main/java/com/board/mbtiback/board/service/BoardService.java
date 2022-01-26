package com.board.mbtiback.board.service;

import com.board.mbtiback.board.dto.boardDTO;

import java.util.ArrayList;
import java.util.List;

public class BoardService {
    public List<boardDTO> retrieveBoardList() {
        List<boardDTO> test = new ArrayList<>();

        test.add(new boardDTO("title1", "content1"));
        test.add(new boardDTO("title2", "content2"));
        test.add(new boardDTO("title3", "content3"));

        return test;
    }
}
