package com.neuedu.service.impl;

import com.github.pagehelper.PageHelper;
import com.neuedu.dao.RoomsMapper;
import com.neuedu.pojo.Rooms;
import com.neuedu.pojo.RoomsExample;
import com.neuedu.service.FloorService;
import com.neuedu.service.RoomsService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * zyp
 * 客房管理
 * 2019-6-17
 */

@Service
public class RoomsServiceImpl implements RoomsService {
    @Resource
    RoomsMapper roomsMapper;
    @Override
    public List<Rooms> getRooms(Rooms rooms) {

        PageHelper.startPage(rooms.getPageNo(), rooms.getPageSize());
        RoomsExample roomsExample = new RoomsExample();
        RoomsExample.Criteria criteria = roomsExample.createCriteria();
        //        模糊查询
        if (rooms.getId()!=null) {
            criteria.andIdEqualTo(rooms.getId()).andActiveEqualTo(1);
        }if(rooms.getFloorId()!=null){
            criteria.andFloorIdEqualTo(rooms.getFloorId()).andActiveEqualTo(1);
        }if(rooms.getRoomTypeid()!=null){
            criteria.andRoomTypeidEqualTo(rooms.getRoomTypeid()).andActiveEqualTo(1);
        }if(rooms.getNormalPrice()!=null){//根据价格查询
            criteria.andNormalPriceEqualTo(rooms.getNormalPrice()).andActiveEqualTo(1);
        } if (rooms.getStatus()!=null){
            criteria.andStatusEqualTo(rooms.getStatus()).andActiveEqualTo(1);
        }
        else {
            criteria.andActiveEqualTo(1);
        }

        return roomsMapper.selectByExample(roomsExample);
    }

    @Override
    public List<Rooms> getAll(Rooms rooms) {
        RoomsExample roomsExample = new RoomsExample();
        return roomsMapper.selectByExample(roomsExample);
    }

    @Override
    public Rooms getroomsById(int id) {
        return roomsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int add(Rooms rooms) {
        rooms.setCreateDate(new Date());
        return roomsMapper.insertSelective(rooms);
    }

    @Override
    public int del(Rooms rooms) {
        return roomsMapper.updateByPrimaryKeySelective(rooms);
    }

    @Override
    public int update(Rooms rooms) {
        return roomsMapper.updateByPrimaryKeySelective(rooms);
    }
}