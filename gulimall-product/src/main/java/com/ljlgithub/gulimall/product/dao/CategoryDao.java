package com.ljlgithub.gulimall.product.dao;

import com.ljlgithub.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author Laijialong
 * @email 1470362551@qq.com
 * @date 2022-07-21 23:22:19
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
