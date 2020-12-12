package com.pro.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @Author: wangxiaoqiang
 * @Date: 2020/12/12 13:11
 * @Description: 邮件
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Mail {
    /**
     * 编号
     */
    private String id;
    /**
     * 标题
     */
    private String title;
    /**
     * 类型 0 已发送 1 草稿箱
     */
    private String type;
    /**
     * 内容
     */
    private String content;
    /**
     * 发件人id
     */
    private String createById;
    /**
     * 发件人
     */
    private User createBy;
    /**
     * 收件人id
     */
    private String acceptById;
    /**
     * 收件人
     */
    private User acceptBy;
    /**
     * 是否已读 0：未读 1：已读
     */
    private String readFlag;
    /**
     * 发送日期
     */
    private LocalDateTime date;


    //后面写定时任务 定时发送

    /**
     * 是否定时发送 0：否 1：是
     */
    private String timingFlag;
    /**
     * 定时发送时间
     */
    private LocalDateTime timingDate;
}
