package com.lee.blog.entity;

import lombok.Data;

/**
 * @Author: 李国祥
 * @Date: 2019/11/15 10:18
 * @Version 1.0
 * 链接
 */
@Data
public class LinkEntity extends BaseEntity{
    private static final long serialVersionUID = -3575333443949057480L;
    /**
     * 链接名称
     */
    private String name;

    /**
     * 链接地址
     */
    private String url;

    /**
     * 链接类型 1：友情链接 2：个人链接
     */
    private Integer type;
}
