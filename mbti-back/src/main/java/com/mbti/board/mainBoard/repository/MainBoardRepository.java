package com.mbti.board.mainBoard.repository;


import com.mbti.board.mainBoard.entity.MainBoard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MainBoardRepository extends JpaRepository<MainBoard, Integer> {
    void deleteByMainBoardNum(int mainBoardNum);

    MainBoard findByMainBoardNum(int mainBoardNum);
}
