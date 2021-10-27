package com.imilia.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.imilia.common.utils.PageUtils;
import com.imilia.mall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author MrZhang
 * @email 582072822@qq.com
 * @date 2021-10-27 18:58:21
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

