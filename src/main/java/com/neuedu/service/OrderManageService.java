package com.neuedu.service;

import com.neuedu.pojo.OrderManage;

import java.util.List;
/*Vanilla
 * 预定信息管理
 * 6-17
 * */
public interface OrderManageService {
    List<OrderManage> getOrderManages(OrderManage orderManage);
    List<OrderManage> getLivedOrderManages(OrderManage orderManage);//ZYP 查询已入住2和已换房4状态的房间
    List<OrderManage> getOrderManages3(OrderManage orderManage);//ZYP 查询已预订0、已入住2和已退房3、已换房4状态的房间
    List<OrderManage> getOrderManages4(OrderManage orderManage);//ZYP 查询已预订0、已取消1状态的房间
    List<OrderManage> getAll(OrderManage orderManage);
    OrderManage getorderManageById(int id);
    int add(OrderManage orderManage);
    int del(OrderManage orderManage);
    //    int del(Integer id);
    int update(OrderManage orderManage);
    List<OrderManage> getLeavingGuestTodayAll(OrderManage orderManage);//ldf 离店报表
}
