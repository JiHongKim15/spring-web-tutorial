package com.mbti.board.mainBoard.service;

import com.mbti.board.mainBoard.entity.MainBoard;
import com.mbti.board.mainBoard.repository.MainBoardRepository;
import org.jboss.jandex.Main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class MainBoardServiceImpl implements MainBoardService{

    @Autowired
    private MainBoardRepository mainBoardRepository;

    @Override
    public List<MainBoard> retrieveMainBoardAll() {
        return mainBoardRepository.findAll();
    }

    @Override
    public MainBoard retrieveMainBoard(int mainBoardNum) {
        return mainBoardRepository.findByMainBoardNum(mainBoardNum);
    }

    @Override
    public MainBoard createMainBoardContent(MainBoard mainBoard) {
        return mainBoardRepository.save(mainBoard);
    }

    @Override
    public MainBoard updateMainBoardContent(MainBoard mainBoard) {
        return mainBoardRepository.save(mainBoard);
    }

    @Override
    public void deleteMainBoardContent(int mainBoardNum) {
        mainBoardRepository.deleteByMainBoardNum(mainBoardNum);
    }

}
