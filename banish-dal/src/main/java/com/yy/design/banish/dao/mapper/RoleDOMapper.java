package com.yy.design.banish.dao.mapper;

import com.yy.design.banish.dao.model.RoleDO;

public interface RoleDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RoleDO record);

    int insertSelective(RoleDO record);

    RoleDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RoleDO record);

    int updateByPrimaryKey(RoleDO record);
}