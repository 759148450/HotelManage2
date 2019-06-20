package com.neuedu.controller;

import com.github.pagehelper.PageInfo;
import com.neuedu.pojo.*;
import com.neuedu.service.*;
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

/**
 * zyp
 * 附加消费管理
 * 2019-6-17
 */
@RestController
@RequestMapping("/consume")
public class ConsumeController {
    @Resource
    ConsumeService consumeService;
    @Resource
    GoodsService goodsService;
    @Resource
    GoodsTypeService goodsTypeService;
    @Resource
    RoomsService roomsService;
    @GetMapping("/list")
    public PageInfo<Consume> getFloor(Consume consume){
        List<Consume> consumes =consumeService.getConsumes(consume);
        PageInfo<Consume> pageInfo = new PageInfo<>(consumes);
        return pageInfo;
    }
    @GetMapping("/getAll")
    public List<Consume> getAll(Consume consume){
        return consumeService.getAll(consume);
    }
    @PostMapping("/add")
    public int add(Consume consume){
        return consumeService.add(consume);
    }
    @GetMapping("/del")
    public int del(Consume consume){
        return consumeService.update(consume);
    }

    @PostMapping("/update")
    public int update(@Valid Consume consume, BindingResult bindingResult){
        return consumeService.update(consume);
    }
    @GetMapping("/getOne")
    public Consume getOne(Integer id){
        return consumeService.getconsumeById(id);
    }

    /*查询所有的商品和商品类型和房间编号*/
    @GetMapping("/getAllGoodsAndRooms")
    public Map<String,List<?>> getAllRoomsAndLeaguers(){
        Map<String,List<?>> map = new HashMap<>();
        map.put("goodss", goodsService.getAll(new Goods()));
        map.put("goodsTypes", goodsTypeService.getAll(new GoodsType()));
        map.put("rooms", roomsService.getAll(new Rooms()));
        return map;
    }

//    /*查询相关联的所有商品*/
//    @GetMapping("/getAllGoods")
//    public List<Goods> getAll(Goods goods){
//        return goodsService.getAll(goods);
//    }
//    /*查询相关联的所有商品类型*/
//    @GetMapping("/getAllGoodsType")
//    public List<GoodsType> getAll(GoodsType goodsType){
//        return goodsTypeService.getAll(goodsType);
//    }
}