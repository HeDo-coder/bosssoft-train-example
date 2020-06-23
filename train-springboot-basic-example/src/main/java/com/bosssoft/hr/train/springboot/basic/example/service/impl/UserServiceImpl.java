/**
 * @file:  UserServiceImpl.java
 * @author: Administrator    
 * @date:   2020-6-19 11:16
 * @copyright: 2020-2023 www.bosssoft.com.cn Inc. All rights reserved. 
 */  
package com.bosssoft.hr.train.springboot.basic.example.service.impl;
import com.bosssoft.hr.train.springboot.basic.example.dao.impl.AbstractBaseDao;
import com.bosssoft.hr.train.springboot.basic.example.dao.impl.AbstractUserDao;
import com.bosssoft.hr.train.springboot.basic.example.dao.mapper.UserMapper;
import com.bosssoft.hr.train.springboot.basic.example.exception.BusinessErrorCode;
import com.bosssoft.hr.train.springboot.basic.example.exception.BusinessException;
import com.bosssoft.hr.train.springboot.basic.example.pojo.dto.RoleDTO;
import com.bosssoft.hr.train.springboot.basic.example.pojo.dto.UserDTO;
import com.bosssoft.hr.train.springboot.basic.example.pojo.entity.User;
import com.bosssoft.hr.train.springboot.basic.example.pojo.query.UserQuery;
import com.bosssoft.hr.train.springboot.basic.example.pojo.vo.UserVO;
import com.bosssoft.hr.train.springboot.basic.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

/**
 * @class UserServiceImpl
 * @classdesc 该类实现所有关于User服务相关的方法，如果该服务
 *  内容过多方法 考虑实现多个接口，基于接口对方法做归类
 *
 * @author Administrator
 * @date 2020-6-19  10:55
 * @version 1.0.0
 * @see
 * @since
 */
public class UserServiceImpl  implements UserService<UserDTO, UserVO, UserQuery> {

    /**
     * 注入具体的dao
     */
    @Autowired
    @Qualifier(value = "userDaoImpl")
    private AbstractUserDao<User, UserMapper> abstractUserDao;
    @Override
    public UserDTO registry(UserDTO userDTO) {
        try {

            // do service
            abstractUserDao.save(null);
            return null;
        }catch (Exception ex){
            throw new BusinessException(BusinessErrorCode.FAIL_TO_REGIST_USER,ex);
        }

    }

    @Override
    public boolean logout(UserDTO userDTO) {
        return false;
    }


    @Override
    public List<UserVO> queryByComboCondition(UserQuery query) {
        return null;
    }

    @Override
    public UserDTO assignRole(List<RoleDTO> roleDTOS) {
        return null;
    }

    @Override
    public List<UserDTO> assignRoleWith(List<UserDTO> userDTOS, List<RoleDTO> roleDTOS) {
        return null;
    }
}
