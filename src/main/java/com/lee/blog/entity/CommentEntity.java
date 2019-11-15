package com.lee.blog.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @Author: 李国祥
 * @Date: 2019/11/15 10:17
 * @Version 1.0
 * 评论
 */
@Data
public class CommentEntity extends BaseEntity{

    private static final long serialVersionUID = 4866841099931530920L;

    /**
     * 评论的文章，为0表示属于留言内容
     */
    private Integer articleId;

    /**
     * 评论者
     */
    private String author;

    /**
     * 评论者的邮箱
     */
    private String email;

    /**
     * 邮箱MD5值，用于显示gravatar头像
     */
    private String emailMd5;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 评论者的浏览器
     */
    private String userAgent;

    /**
     * 评论者的ip地址
     */
    private String ip;

    /**
     * 引用的回复，0表示没有引用
     */
    private Long parentId;

    /**
     * 是否为博主评论
     */
    private Boolean blogger;

    /**
     * 评论时间
     */
    private Date createTime;

    /**
     * 评论状态 0：待审核 1：已发布 2：已删除
     */
    private Integer status;

    /**
     * 评论的文章
     */
    @TableField(exist = false)
    private ArticleEntity article;

    /**
     * 引用的评论
     */
    @TableField(exist = false)
    List<CommentEntity> comments;
}
