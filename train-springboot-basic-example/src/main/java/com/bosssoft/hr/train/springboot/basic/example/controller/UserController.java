/**
 * @file:  UserController.java
 * @author: Administrator
 * @date:   2020-6-19 11:20
 * @copyright: 2020-2023 www.bosssoft.com.cn Inc. All rights reserved.
 */
package com.bosssoft.hr.train.springboot.basic.example.controller;

import com.bosssoft.hr.train.springboot.basic.example.api.UserServiceApi;
import com.bosssoft.hr.train.springboot.basic.example.data.convention.CommonResponse;
import com.bosssoft.hr.train.springboot.basic.example.pojo.dto.RoleDTO;
import com.bosssoft.hr.train.springboot.basic.example.pojo.dto.UserDTO;
import com.bosssoft.hr.train.springboot.basic.example.pojo.query.UserQuery;
import com.bosssoft.hr.train.springboot.basic.example.pojo.vo.RoleResourceVO;
import com.bosssoft.hr.train.springboot.basic.example.pojo.vo.RoleVO;
import com.bosssoft.hr.train.springboot.basic.example.pojo.vo.UserVO;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * @class UserController
 * @classdesc 用户相关的业务逻辑通过控制器进行调用，功能的定义依赖api接口
 *
 * @author Administrator
 * @date 2020-6-19  11:19
 * @version 1.0.0
 * @see
 * @since
 */
@RestController
public  class UserController extends AbstractController implements UserServiceApi {


    @Override
    public CommonResponse<UserVO> registry(@Valid UserDTO userDTO) {
        return null;
    }

    @Override
    public CommonResponse<Boolean> logout(@Valid UserDTO userDTO) {
        return null;
    }

    @Override
    public CommonResponse<List<UserVO>> queryByComboCondition(UserQuery query) {
        return null;
    }

    @Override
    public CommonResponse<UserVO> assignRole(@Valid List<RoleDTO> roleDTOS) {
        return null;
    }

    @Override
    public CommonResponse<List<UserVO>> assignRole(@Valid List<UserDTO> userDTOS, List<RoleDTO> roleDTOS) {
        return null;
    }

    @Override
    public CommonResponse<List<RoleResourceVO>> getRoleResource(@Valid Long userId) {
        return null;
    }

    @Override
    public CommonResponse<List<RoleVO>> getRoles(@Valid Long userId) {
        return null;
    }

    @Override
    public CommonResponse<UserVO> createUser(@Valid UserDTO userDTO) {
        return null;
    }

    @Override
    public CommonResponse<UserVO> updateUser(@Valid UserDTO userDTO) {
        return null;
    }

    @Override
    public CommonResponse<UserVO> deleteUser(@Valid UserDTO userDTO) {
        return null;
    }


}
