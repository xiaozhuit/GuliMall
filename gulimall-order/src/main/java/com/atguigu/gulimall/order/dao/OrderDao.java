package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author xiaozhu
 * @email brave-z@qq.com
 * @date 2023-04-02 22:29:29
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
