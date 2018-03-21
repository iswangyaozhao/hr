package org.hr.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.shiro.crypto.hash.Md5Hash;
import org.hr.dao.UserDao;
import org.hr.pojo.User;
import org.hr.service.UserService;
import org.springframework.stereotype.Service;

@Service("userSerice")
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public Map<String, Object> addUser(User user) {
		Map<String, Object> map = new HashMap<>();
		//对密码进行加密存储
		Md5Hash md5Hash = new Md5Hash(user.getPassword(), user.getSalt());
		user.setPassword(md5Hash.toString());
		userDao.add(user);
		//userDao.addUserRole(user.getId(), roleIds);
		map.put("result", true);
		return map;
		
		
	}

	@Override
	public Map<String, Object> listMap(Integer page, Integer rows, String sort, String order, User condition) {
		Map<String, Object> map = new HashMap<>();
		int start = (page - 1) * rows;
		List<User> list = userDao.getListByCondition(start, rows, condition, sort, order);
		int total = userDao.getCountByCondition(condition);
		map.put("rows", list);
		map.put("total", total);
		return map;
	}

	@Override
	public User view(Integer id) {
		return userDao.getById(id);
	}

	@Override
	public Map<String, Object> updata(User user) {
		Map<String, Object> map = new HashMap<>();
		userDao.update(user);
		map.put("result", true);
		return map;
	}

	@Override
	public Map<String, Object> delById(Integer id) {
		Map<String, Object> map = new HashMap<>();
		userDao.deleteById(id);
		map.put("result", true);
		return map;
	}

}
