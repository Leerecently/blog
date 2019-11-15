package com.lee.blog.entity;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @Author: 李国祥
 * @Date: 2019/11/15 10:17
 * @Version 1.0
 * 博客配置
 */
@Data
public class ConfigEntity extends BaseEntity{

    private static final long serialVersionUID = 5561468215871740092L;
    /**
     * 参数名
     */
    @NotBlank(message = "参数名不能为空")
    private String name;

    /**
     * 参数值
     */
    private String value;

    /**
     * 配置类型 1：全局参数 2：系统配置
     */
    private Integer type;

    /**
     * 描述
     */
    private String description;
}
