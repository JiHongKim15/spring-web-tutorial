package com.mbti.board.mainBoard.service;

import com.mbti.board.mainBoard.dto.MainBoard;
import org.springframework.stereotype.Service;

import java.util.List;


public interface MainBoardService {

    public List<MainBoard> retrieveMainBoardAll();
    public int createMainBoardContent(MainBoard mainBoard);

}
