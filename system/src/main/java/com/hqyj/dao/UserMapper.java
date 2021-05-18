package com.hqyj.dao;

import com.hqyj.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(String userNumber);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String userNumber);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}