package com.bosssoft.hr.train.springboot.basic.example.pojo.query;

import lombok.Data;

/**
 * @param
 * @description:
 * @author: Administrator
 * @create: 2020-06-18 22:31
 * @since
 **/
@Data
public class UserQuery extends BaseQuery {
    /**
     * 对应查询条件的姓名支持模糊查询
     */
    private String name;
}
