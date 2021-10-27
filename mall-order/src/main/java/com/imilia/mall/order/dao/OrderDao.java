package com.imilia.mall.order.dao;

import com.imilia.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author MrZhang
 * @email 582072822@qq.com
 * @date 2021-10-27 19:22:21
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
