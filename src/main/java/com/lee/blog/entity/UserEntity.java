package com.lee.blog.entity;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author: 李国祥
 * @Date: 2019/11/15 9:54
 * @Version 1.0
 * 用户
 */
@Data
public class UserEntity implements Serializable {

    private static final long serialVersionUID = -7182792983059294361L;

    /**
     * 用户名
     */
    @NotBlank(message = "用户名不能为空")
    private String username;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 密码
     */
    @NotBlank(message = "密码不能为空")
    @Length(min = 6, message = "密码不能小于6位")
    private String password;

    /**
     * 密码盐
     */
    private String salt;

    /**
     * 邮箱
     */
    @Email(message = "邮箱格式不正确")
    private String email;

    /**
     * 邮箱的MD5值，用于显示头像
     */
    private String emailMd5;

    /**
     * 最后登录时间
     */
    private Date lastLogin;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 登录失败次数，超过一定次数禁用账号
     */
    private Integer loginFail;

    /**
     * 是否禁用 0：否 1：是
     */
    private Boolean disable;
}
