package com.neuedu.service.impl;
import com.github.pagehelper.PageHelper;
import com.neuedu.dao.OrderManageMapper;
import com.neuedu.pojo.OrderManage;
import com.neuedu.pojo.OrderManageExample;
import com.neuedu.service.OrderManageService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
/*Vanilla
 * 预定信息管理
 * 6-17
 * */
@Service
public class OrderManageServiceImpl implements OrderManageService {
    @Resource
    OrderManageMapper orderManageMapper;
    @Override
    public List<OrderManage> getOrderManages(OrderManage orderManage) {

        PageHelper.startPage(orderManage.getPageNo(), orderManage.getPageSize());
        OrderManageExample orderManageExample = new OrderManageExample();
        OrderManageExample.Criteria criteria = orderManageExample.createCriteria();
        /*根据订单编号模糊查询*/
        if (orderManage.getId()!=null) {
            criteria.andIdEqualTo(orderManage.getId()).andActiveEqualTo(1);
        }
        /*根据房间编号查询*/
        if (orderManage.getOriginalRoomId()!=null){
            criteria.andOriginalRoomIdEqualTo(orderManage.getOriginalRoomId()).andActiveEqualTo(1);
        }
        /*根据预定状态查询信息*/
        if(orderManage.getBookStatus()!=null){
            criteria.andBookStatusEqualTo(orderManage.getBookStatus()).andActiveEqualTo(1);
        }
        /*根据预定人姓名模糊查询*/
        if(StringUtils.isNotBlank(orderManage.getResidents())){
            criteria.andResidentsLike("%"+orderManage.getResidents()+"%").andActiveEqualTo(1);
        }
        /*根据房间类型名称进行模糊查询*/
        if(StringUtils.isNotBlank(orderManage.getRoomsTypeName())){
            criteria.andRoomsTypeNameLike("%"+orderManage.getRoomsTypeName()+"%").andActiveEqualTo(1);
        }
        else {
            criteria.andActiveEqualTo(1);
        }
//        if(orderManage.getActive()!=null)
//            criteria.andActiveEqualTo(orderManage.getActive());

        return orderManageMapper.selectByExample(orderManageExample);
    }

    @Override
    public List<OrderManage> getAll(OrderManage orderManage) {
        OrderManageExample orderManageExample = new OrderManageExample();
        orderManageExample.createCriteria().andActiveEqualTo(1);//只查状态为1的
        return orderManageMapper.selectByExample(orderManageExample);
    }

    @Override
    public OrderManage getorderManageById(int id) {
        return orderManageMapper.selectByPrimaryKey(id);
    }
    @Override
    public int add(OrderManage orderManage) {
        orderManage.setCreateDate(new Date());
        return orderManageMapper.insertSelective(orderManage);
    }

    @Override
    public int del(OrderManage orderManage) {
        return orderManageMapper.updateByPrimaryKeySelective(orderManage);
    }

    @Override
    public int update(OrderManage orderManage) {
        return orderManageMapper.updateByPrimaryKeySelective(orderManage);
    }
}
