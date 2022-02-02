package com.mbti.board.mainBoard.service;

import com.mbti.board.mainBoard.entity.MainBoard;
import com.mbti.board.mainBoard.repository.MainBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainBoardServiceImpl implements MainBoardService{

    @Autowired
    private MainBoardRepository mainBoardRepository;

    @Override
    public List<MainBoard> retrieveMainBoardAll() {

        return mainBoardRepository.findAll();

        /*
        //testData

        List<MainBoardEntity> mainBoardEntityList = new ArrayList<>();

        for(int i = 0; i<5; i++) {
            mainBoardEntityList.add(MainBoardEntity.builder()
                    .mainBoardNum(i)
                    .title("title" + i)
                    .content("test" + i)
                    .writer("jh")
                    .build()
            );
        }

        return mainBoardEntityList;*/
    }

    @Override
    public MainBoard retrieveMainBoard(int mainBoardNum) {
        return null;
    }

    @Override
    public int createMainBoardContent(MainBoard mainBoard) {
        //데이터 생성
        mainBoardRepository.save(mainBoard);
        return 1;
    }

    @Override
    public int updateMainBoardContent(MainBoard mainBoard) {
        return 0;
    }

    @Override
    public int deleteMainBoardContent(int mainBoardNum) {
        return 0;
    }


}
