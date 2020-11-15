package com.pro.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * @Author: wangxiaoqiang
 * @Date: 2020/11/15 15:07
 * @Description:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "t_user")
public class User {
    private String id;
    private String username;
    private String password;
    private String name;
    private String sex;
}
