/**
 * @file:  UserDao.java
 * @author: Administrator    
 * @date:   2020-6-19 11:47
 * @copyright: 2020-2023 www.bosssoft.com.cn Inc. All rights reserved. 
 */  
package com.bosssoft.hr.train.springboot.basic.example.dao.impl;

import com.bosssoft.hr.train.springboot.basic.example.pojo.entity.User;
import com.bosssoft.hr.train.springboot.basic.example.pojo.query.BaseQuery;

import java.util.List;
/**
 * @class UserDao
 * @classdesc
 * @author Administrator
 * @date 2020-6-19  10:38
 * @version 1.0.0
 * @see 
 * @since 
 */
public interface UserDao<T extends User,Q extends BaseQuery>{
   /**
    * @param: 组合的查询条件
    * @return: 满足条件的用户数据集合
    * @see
    * @since
    */
    List<User> queryByCondition(Q query);
}
