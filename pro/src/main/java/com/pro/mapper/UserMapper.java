package com.pro.mapper;

import com.pro.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper{
    User loadUserByUsername(@Param("username") String username);
}
