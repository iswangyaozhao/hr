package org.hr.service;

import java.util.Map;

import org.hr.pojo.User;

public interface UserService {

	/**
	 * 添加用户
	 */
	public Map<String, Object> addUser(User user);
	
	/**
	 * 分页查询
	 * @param page
	 * @param rows
	 * @param sort
	 * @param order
	 * @param condition
	 * @return
	 */
	public Map<String, Object> listMap(Integer page, Integer rows,String sort, String order,User condition);


	/**
	 * 根据id 查询User
	 * @param id
	 * @return
	 */
	public User view(Integer id);
	
	
	/**
	 * 更新用户基础信息
	 * @param user
	 * @return
	 */
	public Map<String, Object> updata(User user);

	/**
	 * 删除用户
	 * @param id
	 * @return
	 */
	public Map<String, Object> delById(Integer id);
	
}
