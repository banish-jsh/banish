package com.yy.design.banish.dao.mapper;

import com.yy.design.banish.dao.model.UserRoleDO;

public interface UserRoleDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserRoleDO record);

    int insertSelective(UserRoleDO record);

    UserRoleDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserRoleDO record);

    int updateByPrimaryKey(UserRoleDO record);
}