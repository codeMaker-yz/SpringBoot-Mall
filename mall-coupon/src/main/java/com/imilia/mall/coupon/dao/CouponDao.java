package com.imilia.mall.coupon.dao;

import com.imilia.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author MrZhang
 * @email 582072822@qq.com
 * @date 2021-10-27 19:02:51
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
