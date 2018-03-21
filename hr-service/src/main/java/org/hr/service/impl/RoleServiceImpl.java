package org.hr.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hr.dao.RoleDao;
import org.hr.pojo.Role;
import org.hr.service.RoleService;
import org.springframework.stereotype.Service;
@Service("roleService")
public class RoleServiceImpl implements RoleService {

	@Resource
	 private RoleDao roleDao;
	
	public void setRoleDao(RoleDao roleDao) {
		this.roleDao = roleDao;
	}

	@Override
	public List<Role> getAll() {
		return roleDao.getAll();
	}

}
