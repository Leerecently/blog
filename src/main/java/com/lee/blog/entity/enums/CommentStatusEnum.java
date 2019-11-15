package com.lee.blog.entity.enums;

/**
 * @Author: 李国祥
 * @Date: 2019/11/15 11:21
 * @Version 1.0
 * 评论状态枚举类
 */
public enum CommentStatusEnum {
    /**
     * 待审核
     */
    CHECKING(0, "待审核"),

    /**
     * 已发布
     */
    PUBLISHED(1, "已发布"),

    /**
     * 已删除
     */
    RECYCLE(2, "已删除");

    private int value;
    private String desc;

    CommentStatusEnum(Integer value, String desc) {
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
