package com.ljj.dao;

import com.ljj.model.User;

import tk.mybatis.mapper.common.Mapper;

/**
* @author LJJ
* @version v1.0
* @since 2017年3月23日 下午12:04:09
*
*/
public interface IUserDao extends Mapper<User> {
    User selectUserById(Integer userId);
}
