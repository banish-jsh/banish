package com.yy.design.banish.dao.mapper;

import com.yy.design.banish.dao.model.RolePrivilegeDO;

public interface RolePrivilegeDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RolePrivilegeDO record);

    int insertSelective(RolePrivilegeDO record);

    RolePrivilegeDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RolePrivilegeDO record);

    int updateByPrimaryKey(RolePrivilegeDO record);
}