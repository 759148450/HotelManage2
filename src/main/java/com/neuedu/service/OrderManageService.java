package com.neuedu.service;

import com.neuedu.pojo.OrderManage;

import java.util.List;
/*Vanilla
 * 预定信息管理
 * 6-17
 * */
public interface OrderManageService {
    List<OrderManage> getOrderManages(OrderManage orderManage);
    List<OrderManage> getOrderManages2(OrderManage orderManage);//查询入住状态的所有信息 -zyp
    List<OrderManage> getAll(OrderManage orderManage);
    OrderManage getorderManageById(int id);
    int add(OrderManage orderManage);
    int del(OrderManage orderManage);
    //    int del(Integer id);
    int update(OrderManage orderManage);
}
