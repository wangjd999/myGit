package com.pro.entity.res;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

/**
 * @Author: wangxiaoqiang
 * @Date: 2020/11/14 16:43
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponseBean {
    /**
     * 返回码： 200：成功 100：失败
     */
    private Integer code;
    /**
     * 返回提示信息
     */
    private String message;
    /**
     * 返回值
     */
    private Object data;

    public static ResponseBean buildHttp(HttpStatus httpStatus){
        return ResponseBean.builder().code(httpStatus.value()).message(httpStatus.getReasonPhrase()).build();
    }
    public static ResponseBean buildBean(Integer code,String message){
        return ResponseBean.builder().code(code).message(message).build();
    }

    public static ResponseBean buildBean(Integer code,String message,Object data){
        return ResponseBean.builder().code(code).message(message).data(data).build();
    }

    public static ResponseBean buildError(String message){
        return ResponseBean.builder().code(100).message(message).build();
    }

    public static ResponseBean buildSuccess(String message,Object data){
        return ResponseBean.builder().code(200).message(message).data(data).build();
    }
}
