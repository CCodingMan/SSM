package com.ljj.service;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ljj.baseTest.SpringTestCase;
import com.ljj.model.User;

/**
* @author LJJ
* @version 
* @since 2017年3月23日 下午1:40:09
*
*/
public class UserServiceTest extends SpringTestCase {
    @Autowired
    private IUserService userService;
    Logger logger = Logger.getLogger(UserServiceTest.class);
    
    @Test
    public void selectUserById(){
    	User user = userService.selectUserById(10);
    	logger.debug("查找结果："+user);
    }
}
