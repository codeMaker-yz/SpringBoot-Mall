package com.imilia.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.imilia.common.utils.PageUtils;
import com.imilia.mall.member.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author MrZhang
 * @email 582072822@qq.com
 * @date 2021-10-27 19:09:00
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

