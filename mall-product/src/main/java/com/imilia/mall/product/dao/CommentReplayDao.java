package com.imilia.mall.product.dao;

import com.imilia.mall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author MrZhang
 * @email 582072822@qq.com
 * @date 2021-10-27 18:58:21
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
