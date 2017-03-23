package com.ljj.dao;

import com.ljj.model.User;

/**
* @author LJJ
* @version v1.0
* @since 2017年3月23日 下午12:04:09
*
*/
public interface IUserDao {
    User selectUserById(Integer userId);
}
