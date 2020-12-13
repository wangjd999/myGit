package com.pro.utils;

import com.pro.entity.User;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.UUID;

/**
 * @Author: wangxiaoqiang
 * @Date: 2020/11/15 14:22
 * @Description:
 */

public class Utils {
    private static String getUUID(){
        return UUID.randomUUID().toString();
    }

    public static User getCurrentUser() {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return user;
    }
}
