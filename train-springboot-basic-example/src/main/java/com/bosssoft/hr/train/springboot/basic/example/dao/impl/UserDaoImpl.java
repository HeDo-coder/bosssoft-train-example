/**
 * @file:  UserDaoImpl.java
 * @author: Administrator    
 * @date:   2020-6-19 11:19
 * @copyright: 2020-2023 www.bosssoft.com.cn Inc. All rights reserved. 
 */  
package com.bosssoft.hr.train.springboot.basic.example.dao.impl;
/**
 * @file:  UserDaoImpl.java    
 * @author: Administrator    
 * @date:   2020-6-19 10:24
 * @copyright: 2020-2023 www.bosssoft.com.cn Inc. All rights reserved. 
 */  
import com.bosssoft.hr.train.springboot.basic.example.dao.mapper.UserMapper;
import com.bosssoft.hr.train.springboot.basic.example.pojo.entity.User;
import com.bosssoft.hr.train.springboot.basic.example.pojo.query.UserQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * @class UserDaoImpl
 * @classdesc
 * @author Administrator
 * @date 2020-6-19  10:24
 * @version 1.0.0
 * @since 
 */
@Repository(value = "userDaoImpl")
public class UserDaoImpl extends AbstractBaseDao<User, UserMapper> implements UserDao<User,UserQuery> {
    @Override
    public List<User> queryByCondition(UserQuery query) {
        return myMapper.queryByCondition(query);
    }
}
