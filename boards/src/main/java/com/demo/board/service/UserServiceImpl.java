package com.demo.board.service;

import com.demo.board.model.User;
import com.demo.board.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public boolean joinUser(User user) throws Exception {
        //TODO : 존재하는 회원인지 확인
        userRepository.save(user);
        return true;
    }

    @Override
    public Optional<User> profileUser(Long uid) throws Exception {
        Optional<User> user = userRepository.findById(uid);
        return user;
    }

    @Override
    public boolean updateUser(User user) throws Exception {
        Optional<User> updateUser = userRepository.findById(user.getUid());
        updateUser.get().setEmail(user.getEmail());
        updateUser.get().setName(user.getName());
        updateUser.get().setPassword(user.getPassword());
        userRepository.save(updateUser.get());
        return true;
    }

    @Override
    public boolean resignUser(Long uid) throws Exception {
        Optional<User> user = userRepository.findById(uid);
        //TODO : 사용자 검증
        userRepository.delete(user.get());
        return true;
    }
}
