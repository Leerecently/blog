package com.lee.blog.entity;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @Author: 李国祥
 * @Date: 2019/11/15 10:16
 * @Version 1.0
 * 分类
 */
@Data
public class CategoryEntity extends BaseEntity{

    private static final long serialVersionUID = 4037983694925005521L;

    /**
     * 分类名
     */
    @NotBlank(message = "分类名不能为空")
    private String name;

    /**
     * 分类链接
     */
    @NotBlank(message = "分类链接不能为空")
    private String url;
}
