package com.neuedu.controller;

import com.github.pagehelper.PageInfo;
import com.neuedu.pojo.OrderManage;
import com.neuedu.service.OrderManageService;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;
/*Vanilla
* 预定信息管理
* 6-17
* */
@RestController
@RequestMapping("/orderManage")
public class OrderManageController {
    @Resource
    OrderManageService orderManageService;
    @GetMapping("/list")
    public PageInfo<OrderManage> getOrderManage(OrderManage orderManage){
        List<OrderManage> orderManages =orderManageService.getOrderManages(orderManage);
        PageInfo<OrderManage> pageInfo = new PageInfo<>(orderManages);
        return pageInfo;
    }
    @GetMapping("/getAll")
    public List<OrderManage> getAll(OrderManage orderManage){
//        orderManage.setActive(1);
        return orderManageService.getAll(orderManage);
    }
    @PostMapping("/add")
    public int add(OrderManage orderManage){
        return orderManageService.add(orderManage);
    }
    @GetMapping("/del")
    public int del(OrderManage orderManage){
        return orderManageService.update(orderManage);
    }

    @PostMapping("/update")
    public int update(@Valid OrderManage orderManage ,BindingResult bindingResult){
        return orderManageService.update(orderManage);
    }
    @GetMapping("/getOne")
    public OrderManage getOne(Integer id){
        return orderManageService.getorderManageById(id);
    }
}
