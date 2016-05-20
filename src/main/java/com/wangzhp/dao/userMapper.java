package com.wangzhp.dao;

import com.wangzhp.model.user;

public interface userMapper {
    int deleteByPrimaryKey(String userId);

    int insert(user record);

    int insertSelective(user record);

    user selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(user record);

    int updateByPrimaryKey(user record);
}