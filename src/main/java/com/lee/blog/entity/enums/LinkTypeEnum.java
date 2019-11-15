package com.lee.blog.entity.enums;

/**
 * @Author: 李国祥
 * @Date: 2019/11/15 11:22
 * @Version 1.0
 * 链接类型枚举类
 */
public enum LinkTypeEnum {
    /**
     * 友情链接
     */
    FRIEND_LINK(1,"友情链接"),
    /**
     * 个人链接
     */
    PERSONAL_LINK(2,"个人链接");


    private int value;
    private String desc;

    LinkTypeEnum(Integer value, String desc) {
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
