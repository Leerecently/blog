package com.lee.blog.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: 李国祥
 * @Date: 2019/11/15 9:44
 * @Version 1.0
 */
@Data
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1578681351872090336L;

    private Integer id;
}
