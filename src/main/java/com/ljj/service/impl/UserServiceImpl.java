package com.ljj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ljj.dao.IUserDao;
import com.ljj.model.User;
import com.ljj.service.IUserService;

/**
* @author LJJ
* @version v1.0
* @since 2017年3月23日 下午12:04:09
*
*/
@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao userDao;
	
	@Override
	public User selectUserById(Integer userId) {
		return userDao.selectUserById(userId);
	}
    
}
