package com.miu.web.controller;

import com.miu.entity.User;
import com.miu.service.ServiceTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("test")
public class WebTest {

    @Autowired
    private ServiceTest serviceTest;

    @RequestMapping("showAll")
    public String showAll(){
        return serviceTest.showService()+":我是web!";
    }

    @RequestMapping("usetlist")
    public List<User> getUserList(){
        return serviceTest.getUseList();
    }



}
