package com.lee.blog.entity.enums;

/**
 * @Author: 李国祥
 * @Date: 2019/11/15 11:22
 * @Version 1.0
 * 配置类型枚举类
 */
public enum ConfigTypeEnum {
    /**
     * 全局变量
     */
    GLOBAL_OPTION(1, "全局变量"),

    /**
     * 系统配置
     */
    SYSTEM_CONFIG(2, "系统配置");

    private int value;
    private String desc;

    ConfigTypeEnum(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public int getValue() {
        return value;
    }

    public String getDesc() {
        return desc;
    }
}
