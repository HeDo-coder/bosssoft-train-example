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
    boolean registry(T userDTO);
    boolean logout(T userDTO);
    List<V> queryByComboCondition(Q query);
    T assignRole(List<RoleDTO> roleDTOS);
}
