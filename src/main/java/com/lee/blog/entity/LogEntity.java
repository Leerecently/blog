package com.lee.blog.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Author: 李国祥
 * @Date: 2019/11/15 10:18
 * @Version 1.0
 * 访客log
 */
@Data
public class LogEntity extends BaseEntity{
    /**
     * IP地址
     */
    private String ip;

    /**
     * 所在城市
     */
    private String city;

    /**
     * 首次访问的链接
     */
    private String url;

    /**
     * 首次访问的来源
     */
    private String referer;

    /**
     * 首次访问的浏览器类型
     */
    private String userAgent;

    /**
     * 总访问次数
     */
    private Integer visits;

    /**
     * 最后访问时间
     */
    private Date updateTime;

    /**
     * 创建时间
     */
    private Date createTime;
}
