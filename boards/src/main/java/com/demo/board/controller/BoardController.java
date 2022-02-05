package com.demo.board.controller;

import com.demo.board.model.Board;
import com.demo.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor//@Autowired 대신
@RequestMapping("/board")
public class BoardController {

    private final BoardService boardService;

    //게시글 작성
    @PostMapping("/create")
    public ResponseEntity createBoard(@RequestBody Board board) {
        System.out.println(board);

        HashMap result = new HashMap();
        //board.setTitle("hello");
        //System.out.println("cbid " + board.getBid());
        //System.out.println("ctitle " + board.getTitle());
        ResponseEntity responseEntity = null;
        try {
            if(boardService.createBoard(board) == true) {
                result.put("success", "success");
                result.put("board", board);
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
    //게시글 목록
    @GetMapping("/list")
    public ResponseEntity listBoard(){
        HashMap result = new HashMap();
        ResponseEntity responseEntity = null;
        try {
            List<Board> boards = boardService.listBoard();
            if(!boards.isEmpty()){
                result.put("success", "success");
                result.put("boards", boards);
            }else{
                result.put("success", "fail");
            }
            responseEntity = new ResponseEntity(result, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            result.put("success", "error");
            responseEntity = new ResponseEntity(result, HttpStatus.BAD_REQUEST);
        }
        return responseEntity;
    }
    //게시글 읽기
    @GetMapping("/read")
    public ResponseEntity readBoard(@RequestParam Long bid){
        HashMap result = new HashMap();
        System.out.println("bid" + bid);
        ResponseEntity responseEntity = null;
        try {
            Optional<Board> board = boardService.readBoard(bid);
            if(board.isPresent()){
                result.put("success", "success");
                result.put("board", board);
            }else{
                result.put("success", "fail");
            }
            responseEntity = new ResponseEntity(result, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            result.put("success", "error");
            responseEntity = new ResponseEntity(result, HttpStatus.BAD_REQUEST);
        }
        return responseEntity;
    }
    //게시글 수정 Update
    @PutMapping("/update")
    public ResponseEntity updateBoard(@ModelAttribute Board board){
        HashMap result = new HashMap();
        ResponseEntity responseEntity = null;

        try {
            if(boardService.updateBoard(board) == true){
                result.put("success", "success");
                result.put("board", board);
            }else{
                result.put("success", "fail");
            }
            responseEntity = new ResponseEntity(result, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            result.put("success", "error");
            responseEntity = new ResponseEntity(result, HttpStatus.BAD_REQUEST);
        }

        return responseEntity;
    }
    //게시글 삭제 Delete
    @DeleteMapping("/delete")
    public ResponseEntity deleteBoard(@RequestParam Long bid){
        HashMap result = new HashMap();
        ResponseEntity responseEntity = null;

        try {
            if(boardService.deleteBoard(bid) == true){
                result.put("success", "success");
                result.put("bid", bid);
            }else{
                result.put("success", "fail");
            }
            responseEntity = new ResponseEntity(result, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            result.put("success", "error");
            responseEntity = new ResponseEntity(result, HttpStatus.BAD_REQUEST);
        }

        return responseEntity;
    }


}
