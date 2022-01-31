package com.mbti.board.mainBoard.service;

import com.mbti.board.mainBoard.dto.MainBoard;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MainBoardServiceImpl implements MainBoardService{

    @Override
    public int createMainBoardContent(MainBoard mainBoard) {
        //데이터 생성
        return 1;
    }

    @Override
    public List<MainBoard> retrieveMainBoardAll() {
        //testData
        List<MainBoard> mainBoardList = new ArrayList<>();

        for(int i = 0; i<5; i++) {
            mainBoardList.add(MainBoard.builder()
                    .mainBoardNum(i)
                    .content("test" + i)
                    .writer("jh")
                    .build()
            );
        }

        return mainBoardList;
    }
}
