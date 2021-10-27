package com.imilia.mall.order.dao;

import com.imilia.mall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author MrZhang
 * @email 582072822@qq.com
 * @date 2021-10-27 19:22:20
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
