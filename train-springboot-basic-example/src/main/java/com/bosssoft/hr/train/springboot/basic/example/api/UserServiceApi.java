package com.bosssoft.hr.train.springboot.basic.example.api;

import com.bosssoft.hr.train.springboot.basic.example.data.convention.CommonResponse;
import com.bosssoft.hr.train.springboot.basic.example.pojo.dto.RoleDTO;
import com.bosssoft.hr.train.springboot.basic.example.pojo.dto.UserDTO;
import com.bosssoft.hr.train.springboot.basic.example.pojo.query.UserQuery;
import com.bosssoft.hr.train.springboot.basic.example.pojo.vo.UserVO;

import java.util.List;

/**
 * @param
 * @description:
 * @author: Administrator
 * @create: 2020-06-19 00:21
 * @since
 **/
public interface UserServiceApi {
    /**
     *  用户注册调用此接口
     * @param userDTO
     * @return 返回注册成功的用户
     */
    CommonResponse<UserVO> registry(UserDTO userDTO);

    /**
     *  注销将调用service的此方法
     * @param userDTO 注销传入的用户信息
     * @return true注销成功 否则失败
     */
    CommonResponse<Boolean> logout(UserDTO userDTO);

    /**
     *  对应查询区的多条件查询
     * @param query
     * @return 查询返回用户列表UserVO
     */
    List<UserVO> queryByComboCondition(UserQuery query);

    /**
     *  对应界面上选择单个用户后将选择角色将其分配用户
     * @param roleDTOS
     * @return 带有角色对象的用户
     */
    CommonResponse<UserVO> assignRole(List<RoleDTO> roleDTOS);

    /**
     * 对应界面上选择多个用户后将选择角色将其分配用户
     * @param userDTOS
     * @param roleDTOS
     * @return 用户列表其中用户包含角色
     */
    CommonResponse<List<UserVO>> assignRoleWith(List<UserDTO> userDTOS,List<RoleDTO> roleDTOS);

}
