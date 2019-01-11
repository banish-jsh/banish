package com.yy.design.banish.dao.mapper;

import com.yy.design.banish.dao.model.UserCryptDO;

public interface UserCryptDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserCryptDO record);

    int insertSelective(UserCryptDO record);

    UserCryptDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserCryptDO record);

    int updateByPrimaryKey(UserCryptDO record);
}