package com.bosssoft.hr.train.springboot.basic.example.dao.impl;

import com.bosssoft.hr.train.springboot.basic.example.dao.IBaseDao;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @param
 * @description: 该类适配底层tk.mybatis的mapper的基本的增删除该查方法
 * <br> 统一常规的操作接口是的之类不再关注基本的方法同时隔离了底层tk.mybatis
 * <br> 子类dao需要其他的dao方法需要另外实现userDao接口
 * @author: Administrator
 * @create: 2020-06-18 23:04
 * @since
 **/
public abstract class AbstractBaseDao<T,M extends Mapper<T>> implements IBaseDao<T> {

    /**
     *  注入框架隔离的Mappper,后面的数据操作依赖此mapper
     */
    protected M myMapper;
    @Override
    public int save(T entity) {
       return myMapper.insert(entity);
    }

    @Override
    public int delete(T entity) {
        return myMapper.delete(entity);
    }

    @Override
    public int update(T entity) {
        return myMapper.updateByPrimaryKey(entity);
    }
}