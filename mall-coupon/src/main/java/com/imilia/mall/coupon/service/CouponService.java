package com.imilia.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.imilia.common.utils.PageUtils;
import com.imilia.mall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author MrZhang
 * @email 582072822@qq.com
 * @date 2021-10-27 19:02:51
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

