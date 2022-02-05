package com.demo.board.service;

import com.demo.board.model.User;

import java.util.Optional;

public interface UserService {
    public boolean joinUser(User user) throws Exception;//가입
    public Optional<User> profileUser(Long uid) throws Exception;//내 정보 보기
    public boolean updateUser(User uid) throws Exception;//내 정보 수정
    public boolean resignUser(Long uid) throws Exception;//회원탈퇴
}
