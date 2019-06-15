package com.neuedu.service.impl;

import com.github.pagehelper.PageHelper;
import com.neuedu.dao.UserMapper;
import com.neuedu.pojo.User;
import com.neuedu.pojo.UserExample;
import com.neuedu.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;
    @Override
    public List<User> getUsers(User user) {

        PageHelper.startPage(user.getPageNo(), user.getPageSize());
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        if (StringUtils.isNotBlank(user.getUserName()))
            criteria.andUserNameLike("%"+user.getUserName()+"%");
        if(user.getId()!=null)
            criteria.andIdEqualTo(user.getId());

        return userMapper.selectByExample(userExample);
    }

    @Override
    public List<User> getAll(User user) {
        UserExample floorExample = new UserExample();
        return userMapper.selectByExample(floorExample);
    }

    @Override
    public User getuserById(int id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int add(User user) {
        user.setCreateTime(new Date());
        return userMapper.insertSelective(user);
    }

    @Override
    public int del(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public int update(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }
}
