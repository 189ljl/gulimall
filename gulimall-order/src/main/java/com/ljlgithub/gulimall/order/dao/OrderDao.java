package com.ljlgithub.gulimall.order.dao;

import com.ljlgithub.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author Laijialong
 * @email 1470362551@qq.com
 * @date 2022-07-31 12:05:20
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
