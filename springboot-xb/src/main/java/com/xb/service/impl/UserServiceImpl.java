package com.xb.service.impl;


import com.xb.entity.RBAC.UserInfo;
import com.xb.entity.User;
import com.xb.mapper.DingdanMapper;
import com.xb.repository.UserRepository;
import com.xb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private DingdanMapper dingdanMapper;

    @Override
    public List<User> getUserList() {
        return userRepository.findAll();
    }

    @Override
    public User findUserById(long id) {
        return userRepository.findById(id);
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public void edit(User user) {
        userRepository.save(user);
    }

    @Override
    public void delete(long id) {
        userRepository.delete(id);
    }

    public UserInfo findByUsername(String username) {

        return   dingdanMapper.findByUsaernamess(username);
    }
}


