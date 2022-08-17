package com.ljlgithub.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ljlgithub.common.utils.PageUtils;
import com.ljlgithub.gulimall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author Laijialong
 * @email 1470362551@qq.com
 * @date 2022-07-31 12:13:19
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

