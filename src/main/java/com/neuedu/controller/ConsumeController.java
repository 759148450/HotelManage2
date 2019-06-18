package com.neuedu.controller;

import com.github.pagehelper.PageInfo;
import com.neuedu.pojo.Consume;
import com.neuedu.pojo.Goods;
import com.neuedu.pojo.GoodsType;
import com.neuedu.service.ConsumeService;
import com.neuedu.service.GoodsService;
import com.neuedu.service.GoodsTypeService;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

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
    /*查询相关联的所有商品*/
    @GetMapping("/getAllGoods")
    public List<Goods> getAll(Goods goods){
        return goodsService.getAll(goods);
    }
    /*查询相关联的所有商品类型*/
    @GetMapping("/getAllGoodsType")
    public List<GoodsType> getAll(GoodsType goodsType){
        return goodsTypeService.getAll(goodsType);
    }
}
