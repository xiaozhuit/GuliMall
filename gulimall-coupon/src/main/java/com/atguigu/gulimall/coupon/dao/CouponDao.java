package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author xiaozhu
 * @email brave-z@qq.com
 * @date 2023-04-02 22:10:04
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
