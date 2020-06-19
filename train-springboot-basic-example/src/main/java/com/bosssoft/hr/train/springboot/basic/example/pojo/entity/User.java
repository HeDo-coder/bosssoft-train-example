package com.bosssoft.hr.train.springboot.basic.example.pojo.entity;

import lombok.Data;
import java.util.Set;

/**
 * @class User
 * @classdesc 数据库用户表对应的实体
 * @author Administrator
 * @date 2020-6-19  10:45
 * @version 1.0.0
 * @see
 * @since
 */
@Data
public class User extends BaseEntity {
    /**
     * 工号具有唯一性一般用于登录系统
     */
    private String code;
    /**
     * 姓名注意不作登录使用
     */
    private String name;
    /**
     *  性别
     */
    private Byte sex;
    /**
     * 密码
     */
    private String password;
    /**
     * 用户所包含的角色
     */
    private Set<Role> roleSet;
}
