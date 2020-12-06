package com.pro.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: wangxiaoqiang
 * @Date: 2020/12/6 12:00
 * @Description:
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Role {
    private String id;
    private String name;
}
