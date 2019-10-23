package com.miu.service;

import com.miu.dao.DaoTest;
import com.miu.dao.mapper.UserMapper;
import com.miu.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceTest {

    @Autowired
    private UserMapper userMapper;

    public String showService() {
        DaoTest daoTest = new DaoTest();
        return daoTest.DaoTest() + ":我是service";
    }

    public List<User> getUseList(){
        return userMapper.getUserList();
    }

}
