package com.bosssoft.hr.train.springboot.basic.example.service.impl;

import com.bosssoft.hr.train.springboot.basic.example.dao.impl.UserDao;
import com.bosssoft.hr.train.springboot.basic.example.pojo.dto.RoleDTO;
import com.bosssoft.hr.train.springboot.basic.example.pojo.dto.UserDTO;
import com.bosssoft.hr.train.springboot.basic.example.pojo.query.UserQuery;
import com.bosssoft.hr.train.springboot.basic.example.pojo.vo.UserVO;
import com.bosssoft.hr.train.springboot.basic.example.service.UserService;

import java.util.List;

/**
 * @description: 该类实现所有关于User服务相关的方法，如果该服务
 * 内容过多方法 考虑实现多个接口，基于接口对方法做归类
 * @author: Administrator
 * @create: 2020-06-18 23:31
 * @since
 **/
public class UserServiceImpl  implements UserService<UserDTO, UserVO, UserQuery> {

    @Override
    public boolean registry(UserDTO userDTO) {
        return false;
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
}
