package com.bosssoft.hr.train.springboot.basic.example.pojo.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @class Role
 * @classdesc RBAC 中的 R 角色表的记录和用户形成多对多业务关系
 * @author Administrator
 * @date 2020-6-19  10:44
 * @version 1.0.0
 * @see
 * @since
 */
@NoArgsConstructor
@AllArgsConstructor
public class Role extends BaseEntity{
    /**
     * 角色的名字
     */
    private String name;
    /**
     * 角色的备注
     */
    private String remarks;
}
