package com.pro.service.impl;

import com.pro.mapper.UserDao;
import com.pro.entity.User;
import com.pro.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: wangxiaoqiang
 * @Date: 2020/11/15 14:12
 * @Description:
 */

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public List<User> getAllUser() {
        return userDao.selectAll();
    }
}
