package com.bosssoft.hr.train.springboot.basic.example.controller;

import com.bosssoft.hr.train.springboot.basic.example.api.UserServiceApi;
import com.bosssoft.hr.train.springboot.basic.example.data.convention.CommonResponse;
import com.bosssoft.hr.train.springboot.basic.example.pojo.dto.RoleDTO;
import com.bosssoft.hr.train.springboot.basic.example.pojo.dto.UserDTO;
import com.bosssoft.hr.train.springboot.basic.example.pojo.query.UserQuery;
import com.bosssoft.hr.train.springboot.basic.example.pojo.vo.UserVO;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @param
 * @description: 这里依据界面的业务定义接口
 * @author: Administrator
 * @create: 2020-06-19 00:21
 * @since
 **/
@RestController
public  class UserController extends AbstractController implements UserServiceApi {

    @Override
    public CommonResponse<UserVO> registry(UserDTO userDTO) {
        return null;
    }

    @Override
    public CommonResponse<Boolean> logout(UserDTO userDTO) {
        return null;
    }

    @Override
    public List<UserVO> queryByComboCondition(UserQuery query) {
        return null;
    }

    @Override
    public CommonResponse<UserVO> assignRole(List<RoleDTO> roleDTOS) {
        return null;
    }

    @Override
    public CommonResponse<List<UserVO>> assignRoleWith(List<UserDTO> userDTOS, List<RoleDTO> roleDTOS) {
        return null;
    }
}
