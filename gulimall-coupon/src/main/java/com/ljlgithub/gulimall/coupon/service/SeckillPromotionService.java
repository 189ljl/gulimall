package com.ljlgithub.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ljlgithub.common.utils.PageUtils;
import com.ljlgithub.gulimall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author Laijialong
 * @email 1470362551@qq.com
 * @date 2022-07-31 12:09:06
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

