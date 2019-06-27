package com.neuedu.service.impl;

import com.github.pagehelper.PageHelper;
import com.neuedu.dao.LogManagementMapper;
import com.neuedu.pojo.LogManagement;
import com.neuedu.pojo.LogManagementExample;
import com.neuedu.service.LogManagementService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.List;

@Service
public class LogManagementServiceImpl implements LogManagementService {
    @Resource
    LogManagementMapper logManagementMapper;
    @Override
    public List<LogManagement> getLogManagements(LogManagement logManagement) {

        PageHelper.startPage(logManagement.getPageNo(), logManagement.getPageSize());
        LogManagementExample logManagementExample = new LogManagementExample();
        LogManagementExample.Criteria criteria = logManagementExample.createCriteria();
        if (StringUtils.isNotBlank(logManagement.getUserName())) {
            criteria.andUserNameLike("%" + logManagement.getUserName() + "%").andActiveEqualTo(1);
        } else{
            criteria.andActiveEqualTo(1);
        }
//        LogManagementTypeExample logManagementTypeExample=new LogManagementTypeExample();
//        LogManagementTypeExample.Criteria criteria_type= logManagementTypeExample.createCriteria();

//        if(logManagement.getActive()!=null)
//            criteria.andActiveEqualTo(logManagement.getActive());
        return logManagementMapper.selectByExample(logManagementExample);
    }

    @Override
    public List<LogManagement> getAll(LogManagement logManagement) {
        LogManagementExample logManagementExample = new LogManagementExample();
//        logManagementExample.createCriteria().andActiveEqualTo(1);//只查状态为1的
        return logManagementMapper.selectByExample(logManagementExample);
    }

    @Override
    public LogManagement getlogManagementById(int id) {
        return logManagementMapper.selectByPrimaryKey(id);
    }

    @Override
    public int add(LogManagement logManagement) {
        return logManagementMapper.insertSelective(logManagement);
    }

    @Override
    public int del(LogManagement logManagement) {
        return logManagementMapper.updateByPrimaryKeySelective(logManagement);
    }

    @Override
    public int update(LogManagement logManagement) {
        return logManagementMapper.updateByPrimaryKeySelective(logManagement);
    }
}
