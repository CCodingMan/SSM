package com.ljj.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ljj.model.User;
import com.ljj.service.IUserService;

/**
* @author LJJ
* @version v1.0
* @since 2017年3月23日 下午12:04:09
*
*/
@Controller
public class UserController {
  @Autowired	
  private IUserService userService;
  
  @RequestMapping(value = "/selectOne/{userId}")
  public ModelAndView getUserOne(@PathVariable("userId") Integer userId){
      User user = userService.selectUserById(userId);
      ModelAndView mav = new ModelAndView("index");
      mav.addObject("user", user);
	  return mav;
  }
  
  @RequestMapping(value = "/one/{userId}")
  public String getOne(@PathVariable("userId") Integer userId,HttpServletRequest request){
	  User user =  userService.selectUserById(userId);
	  request.setAttribute("user", user);
	  return "index";
  }
  
  @RequestMapping(value = "/All")
  @ResponseBody
  public Object getAll(){
	  List<User> userList =  userService.selectAll();
	  return userList;
  }
}
