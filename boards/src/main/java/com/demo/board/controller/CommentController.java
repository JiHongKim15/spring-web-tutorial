package com.demo.board.controller;

import com.demo.board.model.Board;
import com.demo.board.model.Comment;
import com.demo.board.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    private CommentService commentService;

    //댓글 작성
    @PostMapping("/create")
    public ResponseEntity createComment(@RequestBody Comment comment) {
        HashMap result = new HashMap();
        ResponseEntity responseEntity = null;
        try {
            if(commentService.createComment(comment) == true) {
                result.put("success", "success");
                result.put("comment", comment);
            }
            else{
                result.put("success", "fail");
            }
            responseEntity = new ResponseEntity(result, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            result.put("success", "error");
            responseEntity = new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
        }

        return responseEntity;
    }

    //댓글 목록
    @PostMapping("/list")
    public ResponseEntity listComment(@RequestParam Long bid) {
        HashMap result = new HashMap();
        ResponseEntity responseEntity = null;
        List<Comment> comments = null;
        try {
            comments = commentService.listComment(bid);
            if(!comments.isEmpty()) {
                result.put("success", "success");
                result.put("comment", comments);
            }
            else{
                result.put("success", "fail");
            }
            responseEntity = new ResponseEntity(result, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            result.put("success", "error");
            responseEntity = new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
        }

        return responseEntity;
    }

    //댓글 수정
    @PostMapping("/update")
    public ResponseEntity updateComment(@RequestBody Comment comment) {
        HashMap result = new HashMap();
        ResponseEntity responseEntity = null;
        try {
            if(commentService.updateComment(comment) == true) {
                result.put("success", "success");
                result.put("comment", comment);
            }
            else{
                result.put("success", "fail");
            }
            responseEntity = new ResponseEntity(result, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            result.put("success", "error");
            responseEntity = new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
        }

        return responseEntity;
    }

    //댓글 삭제
    @DeleteMapping("/delete")
    public ResponseEntity deleteComment(@RequestParam Long cid) {
        HashMap result = new HashMap();
        ResponseEntity responseEntity = null;
        try {
            if(commentService.deleteComment(cid) == true) {
                result.put("success", "success");
                result.put("cid", cid);
            }
            else{
                result.put("success", "fail");
            }
            responseEntity = new ResponseEntity(result, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            result.put("success", "error");
            responseEntity = new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
        }

        return responseEntity;
    }
}
