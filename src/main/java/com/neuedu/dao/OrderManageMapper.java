package com.neuedu.dao;

import com.neuedu.pojo.OrderManage;
import com.neuedu.pojo.OrderManageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderManageMapper {
    long countByExample(OrderManageExample example);

    int deleteByExample(OrderManageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderManage record);

    int insertSelective(OrderManage record);

    List<OrderManage> selectByExample(OrderManageExample example);

    OrderManage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderManage record, @Param("example") OrderManageExample example);

    int updateByExample(@Param("record") OrderManage record, @Param("example") OrderManageExample example);

    int updateByPrimaryKeySelective(OrderManage record);

    int updateByPrimaryKey(OrderManage record);
}