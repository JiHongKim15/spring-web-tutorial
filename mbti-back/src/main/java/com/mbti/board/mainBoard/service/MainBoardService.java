package com.mbti.board.mainBoard.service;

import com.mbti.board.mainBoard.entity.MainBoard;

import java.util.List;


public interface MainBoardService {

    public List<MainBoard> retrieveMainBoardAll();
    public MainBoard retrieveMainBoard(int mainBoardNum);
    public int createMainBoardContent(MainBoard mainBoard);
    public int updateMainBoardContent(MainBoard mainBoard);
    public int deleteMainBoardContent(int mainBoardNum);

}
