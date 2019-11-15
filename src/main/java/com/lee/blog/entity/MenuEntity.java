package com.lee.blog.entity;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @Author: 李国祥
 * @Date: 2019/11/15 10:18
 * @Version 1.0
 */
@Data
public class MenuEntity extends BaseEntity {

    private static final long serialVersionUID = -2291804801461643061L;

    /**
     * 菜单名
     */
    @NotBlank(message = "菜单名不能为空")
    private String name;

    /**
     * 菜单链接
     */
    @NotBlank(message = "菜单链接不能为空")
    private String url;

    /**
     * 是否在新窗口打开菜单
     */
    private Boolean isBlank;

    /**
     * 菜单图标
     */
    private String icon;

    /**
     * 菜单排序，越小的越靠前
     */

    @NotNull(message = "菜单排序不能为空")
    private Integer sort;
}
