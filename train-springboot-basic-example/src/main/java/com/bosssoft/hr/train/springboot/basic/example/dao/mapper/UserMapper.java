package com.bosssoft.hr.train.springboot.basic.example.dao.mapper;
import com.bosssoft.hr.train.springboot.basic.example.pojo.entity.User;
import com.bosssoft.hr.train.springboot.basic.example.pojo.query.UserQuery;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import java.util.List;

/**
 *
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
