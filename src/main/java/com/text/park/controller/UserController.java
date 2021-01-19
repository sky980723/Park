package com.text.park.controller;

import com.text.park.entity.User;
import com.text.park.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:sky
 * @Date: 2021/1/18 17:42
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    IUserService userService;

    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    public User getUser(@RequestParam(name = "userId")String userId) {

        return userService.getUser(userId);
    }
}
