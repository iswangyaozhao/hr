package org.hr.service;

import java.util.List;

import org.hr.pojo.Role;

public interface RoleService {

	/**
	 * 获取所有的角色
	 * @return
	 */
	public List<Role> getAll();
}
