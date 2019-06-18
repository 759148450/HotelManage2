package com.neuedu.service.impl;

import com.github.pagehelper.PageHelper;
import com.neuedu.dao.ConsumeMapper;
import com.neuedu.pojo.Consume;
import com.neuedu.pojo.ConsumeExample;
import com.neuedu.service.ConsumeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class ConsumeServiceImpl implements ConsumeService {
    @Resource
    ConsumeMapper consumeMapper;
    @Override
    public List<Consume> getConsumes(Consume consume) {

        PageHelper.startPage(consume.getPageNo(), consume.getPageSize());
        ConsumeExample consumeExample = new ConsumeExample();
        ConsumeExample.Criteria criteria = consumeExample.createCriteria();
        if(consume.getGoodId()!=null){
            criteria.andGoodIdEqualTo(consume.getGoodId()).andActiveEqualTo(1);
        }if(consume.getGoodTypeid()!=null){
            criteria.andGoodTypeidEqualTo(consume.getGoodTypeid()).andActiveEqualTo(1);
        }
        if (consume.getRoomId()!=null) {
            criteria.andRoomIdEqualTo(consume.getRoomId()).andActiveEqualTo(1);
        }
        else {
            criteria.andActiveEqualTo(1);
        }

        return consumeMapper.selectByExample(consumeExample);
    }

    @Override
    public List<Consume> getAll(Consume consume) {
        ConsumeExample consumeExample = new ConsumeExample();
        return consumeMapper.selectByExample(consumeExample);
    }

    @Override
    public Consume getconsumeById(int id) {
        return consumeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int add(Consume consume) {
        consume.setCreateDate(new Date());
        return consumeMapper.insertSelective(consume);
    }

    @Override
    public int del(Consume consume) {
        return consumeMapper.updateByPrimaryKeySelective(consume);
    }

    @Override
    public int update(Consume consume) {
        return consumeMapper.updateByPrimaryKeySelective(consume);
    }
}
