package org.hr.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.hr.pojo.Archives;
import org.hr.pojo.User;
import org.hr.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource
	private UserService userSerice;
	
	public void setUserSerice(UserService userSerice) {
		this.userSerice = userSerice;
	}
	
	@RequestMapping("/index")
	public String index() throws Exception {
		return "user/index";
	}
	@RequestMapping("/userForm")
	public String userForm() throws Exception {
		return "user/user_form";
	}
	@RequestMapping("/addForm")
	public String addForm() throws Exception {
		return "user/add_form";
	}
	
	@RequestMapping(value="add",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> add(User user,Integer[] roleIds) throws Exception{
		return userSerice.addUser(user);
	}
	
	@RequestMapping(value="list",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> list(@RequestParam(defaultValue="1")Integer page, @RequestParam(defaultValue="10")Integer rows,@RequestParam(defaultValue="id") String sort,@RequestParam(defaultValue="asc") String order,User condition) throws Exception{
		return userSerice.listMap(page, rows, sort, order, condition);
	}
	
	@RequestMapping(value="view",method=RequestMethod.POST)
	@ResponseBody
	public User view(Integer id) throws Exception {
		return userSerice.view(id);
	}
	
	
	@RequestMapping(value="/updata",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> updata(User user) throws Exception{
		return userSerice.updata(user);
	}
	
	@RequestMapping(value="/toadd",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> toAdd(User user) throws Exception{
		return userSerice.addUser(user);
	}
	
	@RequestMapping(value="/del",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> del(Integer id) throws Exception{
		return userSerice.delById(id);
	}
}
