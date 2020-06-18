package com.bosssoft.hr.train.springboot.basic.example.pojo.entity;

import lombok.Data;

/**
 * @param
 * @description:
 * @author: Administrator
 * @create: 2020-06-18 22:17
 * @since
 **/
@Data
public class User extends BaseEntity {
    private String code;
    private String name;
    private Byte sex;
    private String password;
}
