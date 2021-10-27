package com.imilia.mall.order.dao;

import com.imilia.mall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author MrZhang
 * @email 582072822@qq.com
 * @date 2021-10-27 19:22:21
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
