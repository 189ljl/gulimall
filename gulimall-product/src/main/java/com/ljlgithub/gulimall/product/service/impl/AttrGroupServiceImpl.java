package com.ljlgithub.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ljlgithub.common.utils.Query;
import com.ljlgithub.common.utils.PageUtils;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.ljlgithub.gulimall.product.dao.AttrGroupDao;
import com.ljlgithub.gulimall.product.entity.AttrGroupEntity;
import com.ljlgithub.gulimall.product.service.AttrGroupService;


@Service("attrGroupService")
public class AttrGroupServiceImpl extends ServiceImpl<AttrGroupDao, AttrGroupEntity> implements AttrGroupService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<AttrGroupEntity> page = this.page(
                new Query<AttrGroupEntity>().getPage(params),
                new QueryWrapper<AttrGroupEntity>()
        );

        return new PageUtils(page);
    }

}