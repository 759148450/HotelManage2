package com.neuedu.service.impl;

import com.github.pagehelper.PageHelper;
import com.neuedu.dao.LeaguerMapper;
import com.neuedu.pojo.Leaguer;
import com.neuedu.pojo.LeaguerExample;
import com.neuedu.service.LeaguerService;
import lombok.val;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * zyp
 * 会员管理
 * 2019-6-14
 */

@Service
public class LeaguerServiceImpl implements LeaguerService {
    @Resource
    LeaguerMapper leaguerMapper;
    @Override
    public List<Leaguer> getLeaguers(Leaguer leaguer) {

        PageHelper.startPage(leaguer.getPageNo(), leaguer.getPageSize());
        LeaguerExample leaguerExample = new LeaguerExample();
        LeaguerExample.Criteria criteria = leaguerExample.createCriteria();
        if (StringUtils.isNotBlank(leaguer.getGname()))
            criteria.andGnameLike("%"+leaguer.getGname()+"%");
        if (leaguer.getGid()!=null)
            criteria.andGidEqualTo(leaguer.getGid());

        return leaguerMapper.selectByExample(leaguerExample);
    }

    @Override
    public List<Leaguer> getAll(Leaguer leaguer) {
        LeaguerExample leaguerExample = new LeaguerExample();
        return leaguerMapper.selectByExample(leaguerExample);
    }

    @Override
    public Leaguer getleaguerById(int gid) {
        return leaguerMapper.selectByPrimaryKey(gid);
    }

    @Override
    public int add(Leaguer leaguer) {
        leaguer.setCreateDate(new Date());
        return leaguerMapper.insertSelective(leaguer);
    }

    @Override
    public int del(Leaguer leaguer) {
        return leaguerMapper.updateByPrimaryKeySelective(leaguer);
    }

    @Override
    public int update(Leaguer leaguer) {
        return leaguerMapper.updateByPrimaryKeySelective(leaguer);
    }
}
