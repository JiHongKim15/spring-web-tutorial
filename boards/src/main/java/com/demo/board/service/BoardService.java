package com.demo.board.service;

import com.demo.board.model.Board;

import java.util.List;
import java.util.Optional;

public interface BoardService {
    public boolean createBoard(Board board) throws Exception;//게시글 생성
    public Optional<Board> readBoard(Long bid) throws Exception;//게시글 읽기
    //TODO : Optional로 바꾸기 -> 안 바꿔도 될듯?
    public  List<Board> listBoard() throws Exception;//게시글 목록
    public boolean updateBoard(Board board) throws Exception;//게시글 수정
    public boolean deleteBoard(Long bid) throws Exception;//게시글 삭제
}
