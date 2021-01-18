package com.text.park.dao;

import com.text.park.entity.User;

/**
*
* @Author:sky
* @Date: 2021/1/18 17:49
*/
public interface UserMapper {
    int deleteByPrimaryKey(String id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}