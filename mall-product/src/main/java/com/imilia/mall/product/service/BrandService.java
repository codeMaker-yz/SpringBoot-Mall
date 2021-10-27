package com.imilia.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.imilia.common.utils.PageUtils;
import com.imilia.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author MrZhang
 * @email 582072822@qq.com
 * @date 2021-10-27 18:58:22
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

