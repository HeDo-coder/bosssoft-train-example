/**
 * @file:  AbstractBaseDao.java
 * @author: Administrator    
 * @date:   2020-6-19 11:46
 * @copyright: 2020-2023 www.bosssoft.com.cn Inc. All rights reserved. 
 */  
package com.bosssoft.hr.train.springboot.basic.example.dao.impl;
import com.bosssoft.hr.train.springboot.basic.example.dao.mapper.CommonMapper;
import com.bosssoft.hr.train.springboot.basic.example.dao.mapper.RoleMapper;
import com.bosssoft.hr.train.springboot.basic.example.dao.mapper.UserMapper;
import com.bosssoft.hr.train.springboot.basic.example.pojo.entity.Role;
import com.bosssoft.hr.train.springboot.basic.example.pojo.entity.User;
import com.bosssoft.hr.train.springboot.basic.example.pojo.query.RoleQuery;
import com.bosssoft.hr.train.springboot.basic.example.pojo.query.UserQuery;
import tk.mybatis.mapper.common.Mapper;

/**
 * @description: 该类适配底层tk.mybatis的mapper的基本的增删除该查方法
 * <br> 统一常规的操作接口是的之类不再关注基本的方法同时隔离了底层tk.mybatis
 * <br> 子类dao需要其他的dao方法需要另外实现userDao接口
 * @author: Administrator
 * @create: 2020-06-18 23:04
 * @since 1.0
 **/
public abstract class AbstractRoleDao<T,M extends CommonMapper<T>,Q>   extends AbstractBaseDao <Role, RoleMapper,RoleQuery>  implements RoleDao<Role> {

}
