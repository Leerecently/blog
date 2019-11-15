package com.lee.blog.entity;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @Author: 李国祥
 * @Date: 2019/11/15 10:19
 * @Version 1.0
 * 标签
 */
@Data
public class TagEntity extends BaseEntity {
    private static final long serialVersionUID = 8687036762599707671L;
    /**
     * 标签名
     */
    @NotBlank(message = "标签名不能为空")
    private String name;

    /**
     * 标签链接
     */
    @NotBlank(message = "标签链接不能为空")
    private String url;
}
