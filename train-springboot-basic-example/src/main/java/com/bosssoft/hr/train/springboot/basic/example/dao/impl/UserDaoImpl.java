package com.bosssoft.hr.train.springboot.basic.example.dao.impl;

import com.bosssoft.hr.train.springboot.basic.example.dao.mapper.UserMapper;
import com.bosssoft.hr.train.springboot.basic.example.pojo.entity.User;
import com.bosssoft.hr.train.springboot.basic.example.pojo.query.UserQuery;

import java.util.List;

/**
 * @description: 任何继承 AbstractBaseDao 都基本基本的CRUD能力，其他业务驱动的方法
 * 需要开发者实现额外的接口
 * @author: Administrator
 * @create: 2020-06-18 22:54
 * @since
 **/
public class UserDaoImpl extends AbstractBaseDao<User, UserMapper> implements UserDao<User,UserQuery> {
    @Override
    public List<User> queryByConditon(UserQuery query) {
        return myMapper.queryByCondition(query);
    }
}
