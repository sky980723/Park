package com.text.park.dao;

import com.text.park.entity.User;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @Author:sky
 * @Date: 2021/1/18 17:43
 */
@Repository
public interface UserDao {
    User getUser(String userId);
}
