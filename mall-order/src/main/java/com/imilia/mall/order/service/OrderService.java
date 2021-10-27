package com.imilia.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.imilia.common.utils.PageUtils;
import com.imilia.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author MrZhang
 * @email 582072822@qq.com
 * @date 2021-10-27 19:22:21
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

