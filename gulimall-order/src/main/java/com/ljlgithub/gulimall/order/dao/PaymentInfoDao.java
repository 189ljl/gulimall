package com.ljlgithub.gulimall.order.dao;

import com.ljlgithub.gulimall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author Laijialong
 * @email 1470362551@qq.com
 * @date 2022-07-31 12:05:20
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
