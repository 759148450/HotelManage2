package com.neuedu.controller;

import com.github.pagehelper.PageInfo;
import com.neuedu.pojo.User;
import com.neuedu.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    UserService userService;
    @GetMapping("/list")
    public PageInfo<User> getFloor(User user){
        List<User> users =userService.getUsers(user);
        PageInfo<User> pageInfo = new PageInfo<>(users);
        return pageInfo;
    }
    @GetMapping("/getAll")
    public List<User> getAll(User user){
        return userService.getAll(user);
    }
    @PostMapping("/add")
    public int add(User user){
        return userService.add(user);
    }
    @GetMapping("/del")
    public int del(User user){
        return userService.update(user);
    }

    @PostMapping("/update")
    public int update(User user){
        return userService.update(user);
    }
    @GetMapping("/getOne")
    public User getOne(Integer id){
        return userService.getuserById(id);
    }
}
