package com.bosssoft.hr.train.springboot.basic.example.service;
import com.bosssoft.hr.train.springboot.basic.example.pojo.dto.RoleDTO;
import com.bosssoft.hr.train.springboot.basic.example.pojo.dto.UserDTO;
import com.bosssoft.hr.train.springboot.basic.example.pojo.query.BaseQuery;
import com.bosssoft.hr.train.springboot.basic.example.pojo.vo.UserVO;
import java.util.List;
import java.util.Set;

/**
 * @description: 依据需要多少业务动作需要在UserService做就决定UserService需要定义多少
 * 接口方法
 * @author: Administrator
 * @create: 2020-06-18 23:24
 * @since
 **/
public interface UserService<T extends UserDTO,V extends UserVO,Q extends  BaseQuery> {
    /**
     *  用户注册调用此接口
     * @param userDTO
     * @return 返回注册成功的用户
     */
    UserDTO registry(T userDTO);

    /**
     *  注销将调用service的此方法
     * @param userDTO 注销传入的用户信息
     * @return true注销成功 否则失败
     */
    boolean logout(T userDTO);

    /**
     *  对应查询区的多条件查询
     * @param query
     * @return 查询返回用户列表UserVO
     */
    List<V> queryByComboCondition(Q query);

    /**
     *  对应界面上选择单个用户后将选择角色将其分配用户
     * @param roleDTOS
     * @return 带有角色对象的用户
     */
    T assignRole(List<RoleDTO> roleDTOS);

    /**
     * 对应界面上选择多个用户后将选择角色将其分配用户
     * @param userDTOS
     * @param roleDTOS
     * @return 用户列表其中用户包含角色
     */
    List<T> assignRoleWith(List<UserDTO> userDTOS,List<RoleDTO> roleDTOS);

}
