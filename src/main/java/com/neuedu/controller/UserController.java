package com.neuedu.controller;

import com.github.pagehelper.PageInfo;
import com.neuedu.pojo.User;
import com.neuedu.service.UserService;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.apache.ibatis.annotations.Param;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
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

    @CrossOrigin(allowCredentials="true")
    @PostMapping("/login")
    public User login(@Param("userName") String userName, @Param("userPwd") String userPwd, HttpServletResponse response){
        User user=userService.getUserByNameAndUserPwd(userName,userPwd);
//        session.setAttribute("user",user);
//        System.out.println("session"+user.getUserName());
//        UsernamePasswordToken token = new UsernamePasswordToken(userName, userPwd);
        Cookie cookie=new Cookie("userName", user.getUserName());
        cookie.setMaxAge(24*60*60); //存活期为1天
        cookie.setPath("/");
        response.addCookie(cookie);
        System.out.println("cookie"+cookie.getValue());
        return user;
    }
    @GetMapping("/getOne")
    public User getOne(Integer id){
        return userService.getuserById(id);
    }


}
