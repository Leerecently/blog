package com.lee.blog.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @Author: 李国祥
 * @Date: 2019/11/15 10:19
 * @Version 1.0
 * 爬虫规则
 */
@Data
@TableName("blog_spider")
public class SpiderEntity extends BaseEntity {
    private static final long serialVersionUID = 8541989476644309642L;
    /**
     * 爬虫标识名
     */
    @NotBlank(message = "爬虫名称不能为空")
    private String name;
    /**
     * 标题爬取规则
     */
    @NotBlank(message = "标题规则不能为空")
    private String titleRule;
    /**
     * 文章内容爬取规则
     */
    @NotBlank(message = "内容规则不能为空")
    private String contentRule;
}
