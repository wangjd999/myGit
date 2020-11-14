package com.pro.entity.res;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: wangxiaoqiang
 * @Date: 2020/11/14 16:43
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RequestBean {
    private String code;
    private String message;
    private Object data;
}
