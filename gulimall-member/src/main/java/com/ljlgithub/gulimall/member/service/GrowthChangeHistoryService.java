package com.ljlgithub.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ljlgithub.common.utils.PageUtils;
import com.ljlgithub.gulimall.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author Laijialong
 * @email 1470362551@qq.com
 * @date 2022-07-31 12:11:25
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

