package com.ljj.service;

import java.util.List;

import com.ljj.model.User;

/**
* @author LJJ
* @version v1.0
* @since 2017年3月23日 下午12:04:09
*
*/
public interface IUserService {
	User selectUserById(Integer userId);
	
	List<User> selectAll();
}
