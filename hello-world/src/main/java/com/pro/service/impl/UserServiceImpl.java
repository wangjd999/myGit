package com.pro.service.impl;

import com.pro.entity.Role;
import com.pro.mapper.RoleMapper;
import com.pro.mapper.UserMapper;
import com.pro.entity.User;
import com.pro.service.UserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
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
    private UserMapper userMapper;
    @Resource
    private RoleMapper roleDao;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userMapper.loadUserByUsername(s);
        if (user == null) {
            //避免返回null，这里返回一个不含有任何值的User对象，在后期的密码比对过程中一样会验证失败
            return new User();
        }
        //查询用户的角色信息，并返回存入user中
        List<Role> roles = roleDao.getRolesByUserId(user.getId());
        user.setRoles(roles);
        return user;
    }
}
