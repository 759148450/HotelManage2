package com.neuedu.controller;

import com.github.pagehelper.PageInfo;
import com.neuedu.pojo.OrderForm;
import com.neuedu.pojo.OrderManage;
import com.neuedu.pojo.Rooms;
import com.neuedu.service.OrderFormService;
import com.neuedu.service.OrderManageService;
import com.neuedu.service.RoomsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/checkout")
public class OrderFormController {
    @Resource
    OrderFormService orderFormService;
    @Resource
    RoomsService roomsService;
    @Resource
    OrderManageService orderManageService;
    @GetMapping("/list")
    public PageInfo<OrderForm> getOrderForm(OrderForm orderForm){
        List<OrderForm> orderForms =orderFormService.getOrderForms(orderForm);
        PageInfo<OrderForm> pageInfo = new PageInfo<>(orderForms);
        return pageInfo;
    }

    @GetMapping("/getAll")
    public List<OrderForm> getAll(OrderForm orderForm){
        return orderFormService.getAll(orderForm);
    }
    @PostMapping("/add")
    public int add(OrderForm orderForm , OrderManage orderManage){
        /*将客房变为空房状态*/
        Rooms rooms = new Rooms();
        rooms.setId(orderManage.getCurrentRoomId());
        rooms.setStatus(0);
        roomsService.update(rooms);
        //将order_manage状态变为已退房
        OrderManage orderManage1 = new OrderManage();
        orderManage1.setId(orderManage.getCurrentRoomId());
        orderManage1.setBookStatus(3);
        orderManageService.update(orderManage1);
        //进行结账处理
        return orderFormService.add(orderForm);
    }
    @GetMapping("/del")
    public int del(OrderForm orderForm){
        return orderFormService.update(orderForm);
    }

    @PostMapping("/update")
    public int update(OrderForm orderForm){
        return orderFormService.update(orderForm);
    }
    @GetMapping("/getOne")
    public OrderForm getOne(Integer id){
        return orderFormService.getorderFormById(id);
    }
}
