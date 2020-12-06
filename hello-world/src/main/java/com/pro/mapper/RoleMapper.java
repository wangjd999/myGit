package com.pro.mapper;

import com.pro.entity.Role;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @Author: wangxiaoqiang
 * @Date: 2020/12/6 12:05
 * @Description:
 */

@Repository
public interface RoleMapper extends Mapper<Role> {
    List<Role> getRolesByUserId(String userId);
}
