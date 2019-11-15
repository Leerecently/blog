package com.lee.blog.entity;

import lombok.Data;

/**
 * @Author: 李国祥
 * @Date: 2019/11/15 10:16
 * @Version 1.0
 * 文章与标签的对应关系
 */
@Data
public class ArticleTagEntity extends BaseEntity{

    private static final long serialVersionUID = 6183405203649817842L;
    /**
     * 文章ID
     */
    private Integer articleId;
    /**
     * 标签ID
     */
    private Integer tagId;
}
