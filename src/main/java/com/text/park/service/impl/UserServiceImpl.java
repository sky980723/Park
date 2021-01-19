package com.text.park.service.impl;

import com.text.park.dao.UserDao;
import com.text.park.entity.User;
import com.text.park.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:sky
 * @Date: 2021/1/18 17:43
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUser(String userId) {
        User user = userDao.selectByPrimaryKey(userId);

        return user;
    }
}
