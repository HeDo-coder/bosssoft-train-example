package com.bosssoft.hr.train.springboot.basic.example.dao.mapper;
import com.bosssoft.hr.train.springboot.basic.example.pojo.entity.User;
import com.bosssoft.hr.train.springboot.basic.example.pojo.query.UserQuery;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import java.util.List;

/**
 * @class UserMapper
 * @classdesc 继承通用tk.mybatis mapper的增删除该方法，增加基于xml配置文件的自定义方法
 * @author Administrator
 * @date 2020-6-23  23:02
 * @version 1.0.0
 * @see
 * @since
 */
@Repository
@org.apache.ibatis.annotations.Mapper
public interface UserMapper extends Mapper<User>, MySqlMapper<User> {
    /**
     *  界面通过复杂查询查询用户
     * @param userQuery
     * @return
     */
    List<User> queryByCondition(UserQuery userQuery);
}
