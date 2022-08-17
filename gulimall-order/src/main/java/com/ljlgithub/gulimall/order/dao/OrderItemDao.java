package com.ljlgithub.gulimall.order.dao;

import com.ljlgithub.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author Laijialong
 * @email 1470362551@qq.com
 * @date 2022-07-31 12:05:20
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
