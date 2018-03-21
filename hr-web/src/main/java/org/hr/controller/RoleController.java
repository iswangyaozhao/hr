package org.hr.controller;

import java.util.List;

import javax.annotation.Resource;

import org.hr.pojo.Role;
import org.hr.service.RoleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/role")
public class RoleController {


	@Resource
	private RoleService roleService;

	public void setRoleService(RoleService roleService) {
		this.roleService = roleService;
	}
	
	
	//查询所有角色
	@RequestMapping(value="/all",method=RequestMethod.POST)
	@ResponseBody
	public List<Role> all() throws Exception{
		return roleService.getAll();
	}
	
}
