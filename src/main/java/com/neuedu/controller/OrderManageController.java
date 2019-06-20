package com.neuedu.controller;

import com.github.pagehelper.PageInfo;
import com.neuedu.pojo.Leaguer;
import com.neuedu.pojo.OrderManage;
import com.neuedu.pojo.Rooms;
import com.neuedu.service.LeaguerService;
import com.neuedu.service.OrderManageService;
import com.neuedu.service.RoomsService;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*Vanilla
* 预定信息管理
* 6-17
* */
@RestController
@RequestMapping("/orderManage")
public class OrderManageController {
    @Resource
    OrderManageService orderManageService;
    @Resource
    RoomsService roomsService;
    @Resource
    LeaguerService leaguerService;

    @GetMapping("/list")
    public PageInfo<OrderManage> getOrderManage(OrderManage orderManage){
        List<OrderManage> orderManages =orderManageService.getOrderManages(orderManage);
        PageInfo<OrderManage> pageInfo = new PageInfo<>(orderManages);
        return pageInfo;
    }
    //ldf 2019-6-20
    @GetMapping("/listLiving")
    public PageInfo<OrderManage> getLivingOrderManage(OrderManage orderManage){
        orderManage.setBookStatus(2);
        List<OrderManage> orderManages =orderManageService.getOrderManages(orderManage);
        PageInfo<OrderManage> pageInfo = new PageInfo<>(orderManages);
        return pageInfo;
    }
    @PostMapping("/change")
    public int change(@Valid OrderManage orderManage ,BindingResult bindingResult){
        Integer orgRoomId=orderManage.getOriginalRoomId();
        Integer curRoomId=orderManage.getCurrentRoomId();
        orderManage.setOriginalRoomId(null);
        orderManage.setCurrentRoomId(orgRoomId);
        orderManage.setActive(0);
        orderManageService.update(orderManage);//删除原来的订单表
        orderManage.setOriginalRoomId(orgRoomId);
        orderManage.setCurrentRoomId(curRoomId);
        orderManage.setId(null);
        orderManage.setActive(1);
        return orderManageService.add(orderManage);//创建新订单表
    }
    //-----end----------

    @GetMapping("/getAll")
    public List<OrderManage> getAll(OrderManage orderManage){
//        orderManage.setActive(1);
        return orderManageService.getAll(orderManage);
    }
    @PostMapping("/add")
    public int add(OrderManage orderManage){
        /*将客房变为已预定状态*/
        Rooms rooms = new Rooms();
        rooms.setId(orderManage.getOriginalRoomId());
        rooms.setStatus(1);
        roomsService.update(rooms);
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
    @GetMapping("/updateBookStutas")
    public int updateBookStutas(OrderManage orderManage){
        return orderManageService.update(orderManage);
    }
    @GetMapping("/getOne")
    public OrderManage getOne(@Valid Integer id){
        return orderManageService.getorderManageById(id);
    }
    /*查询所有的房间和会员*/
    @GetMapping("/getAllRoomsAndLeaguers")
    public Map<String,List<?>> getAllRoomsAndLeaguers(){
        Map<String,List<?>> map = new HashMap<>();
        Rooms rooms = new Rooms();
        rooms.setActive(1);
        rooms.setStatus(0);
        map.put("rooms", roomsService.getAll(rooms));
        Leaguer leaguer = new Leaguer();
        leaguer.setActive(1);
        map.put("leaguers", leaguerService.getAll(leaguer));
        return map;
    }
//    /*查询所有的房间*/
//    @GetMapping("/getAllRooms")
//    public List<Rooms> getAll(Rooms rooms){
////        goodsType.setActive(1);
//        return roomsService.getAll(rooms);
//    }
//    /*查询所有的会员*/
//    @GetMapping("/getAllLeaguers")
//    public List<Leaguer> getAll(Leaguer leaguers){
////        goodsType.setActive(1);
//        return leaguerService.getAll(leaguers);
//    }

}

