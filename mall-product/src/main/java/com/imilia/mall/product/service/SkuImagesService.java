package com.imilia.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.imilia.common.utils.PageUtils;
import com.imilia.mall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author MrZhang
 * @email 582072822@qq.com
 * @date 2021-10-27 18:58:21
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

