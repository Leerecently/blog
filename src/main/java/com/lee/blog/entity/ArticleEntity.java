package com.lee.blog.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.List;

/**
 * @Author: 李国祥
 * @Date: 2019/11/15 9:42
 * @Version 1.0
 * 文章
 */
@Data
public class ArticleEntity extends BaseEntity {

    private static final long serialVersionUID = -826705120474043942L;
    /**
     * 文章详情页链接
     */
    private String url;
    /**
     * 文章标题
     */
    private String title;
    /**
     * 文章描述
     */
    private String description;
    /**
     * 文章内容
     */
    @NotBlank(message = "文章内容不能为空")
    private String content;
    /**
     * 分类ID
     */
    private Integer categoryId;
    /**
     * 是否为原创地址
     */
    private Boolean original;
    /**
     * 原文地址
     */
    private String sourceUrl;
    /**
     * Markdown格式的文章内容
     */
    private String contentMd;
    /**
     * 文章的预览图片
     */
    private String image;

    /**
     * 文章是否置顶
     */
    private Boolean isTop;

    /**
     * 是否关闭评论评论
     */
    private Boolean isComment;

    /**
     * 访问量
     */
    private Integer visits;

    /**
     * 状态 0：草稿 1：已发布 2：回收站 3：自定义文章
     */
    private Integer status;

    /**
     * 文章标签
     */
    @TableField(exist = false)
    private List<TagEntity> tags;

    /**
     * 文章分类
     */
    @TableField(exist = false)
    private CategoryEntity category;
    /**
     * 发表时间
     */
    private String createTime;
    /**
     * 最后更新时间
     */
    @TableField(update = "now()")
    private Date updateTime;
}
