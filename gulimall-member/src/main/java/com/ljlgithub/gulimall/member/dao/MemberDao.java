package com.ljlgithub.gulimall.member.dao;

import com.ljlgithub.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author Laijialong
 * @email 1470362551@qq.com
 * @date 2022-07-31 12:11:25
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
