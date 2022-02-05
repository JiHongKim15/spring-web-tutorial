package com.demo.board.service;

import com.demo.board.model.Comment;

import java.util.List;
import java.util.Optional;

public interface CommentService {
    public boolean createComment(Comment comment) throws Exception;//댓글 생성
    //TODO : Optional로 바꾸기
    public List<Comment> listComment(Long bid) throws Exception;//한 게시글의 댓글 목록
    public boolean updateComment(Comment comment) throws Exception;//게시글 수정
    public boolean deleteComment(Long cid) throws Exception;//게시글 삭제
}
