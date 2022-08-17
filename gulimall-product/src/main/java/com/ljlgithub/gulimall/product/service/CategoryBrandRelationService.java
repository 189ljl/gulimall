package com.ljlgithub.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ljlgithub.common.utils.PageUtils;
import com.ljlgithub.gulimall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author Laijialong
 * @email 1470362551@qq.com
 * @date 2022-07-21 23:22:19
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

