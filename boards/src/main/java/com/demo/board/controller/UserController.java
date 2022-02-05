package com.demo.board.controller;

import com.demo.board.model.User;
import com.demo.board.service.UserService;
import io.swagger.models.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    //회원가입
    @PutMapping("/join")
    public ResponseEntity joinUser(@RequestBody User user){
        HashMap result = new HashMap();
        ResponseEntity responseEntity = null;
        try {
            if(userService.joinUser(user) == true){
                result.put("success", "success");
                result.put("user", user);
            }else{
                result.put("success", "fail");
            }
        } catch (Exception e) {
            e.printStackTrace();
            result.put("success", "error");
            responseEntity = new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
        }
        return responseEntity;
    }
    //회원정보 보기
    @GetMapping("/profile")
    public ResponseEntity profileUser(@RequestParam Long uid){
        HashMap result = new HashMap();
        ResponseEntity responseEntity = null;
        try {
            Optional<User> user = userService.profileUser(uid);
            if(user.isPresent()){
                result.put("success", "success");
                result.put("user", user);
            }else{
                result.put("success", "fail");
            }
        } catch (Exception e) {
            e.printStackTrace();
            result.put("success", "error");
            responseEntity = new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
        }
        return responseEntity;

    }
    //회원정보 수정
    @PostMapping("/update")
    public ResponseEntity updateUser(@RequestBody User user){
        HashMap result = new HashMap();
        ResponseEntity responseEntity = null;
        try {
            if(userService.updateUser(user) == true){
                result.put("success", "success");
                result.put("user", user);
            }else{
                result.put("success", "fail");
            }
        } catch (Exception e) {
            e.printStackTrace();
            result.put("success", "error");
            responseEntity = new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
        }
        return responseEntity;
    }
    //회원 탈퇴
    @DeleteMapping("/resign")
    public ResponseEntity resignUser(@RequestParam Long uid){
        HashMap result = new HashMap();
        ResponseEntity responseEntity = null;
        try {
            if(userService.resignUser(uid) == true){
                result.put("success", "success");
                result.put("uid", uid);
            }else{
                result.put("success", "fail");
            }
        } catch (Exception e) {
            e.printStackTrace();
            result.put("success", "error");
            responseEntity = new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
        }
        return responseEntity;
    }
}
