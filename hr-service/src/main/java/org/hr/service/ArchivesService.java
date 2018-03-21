package org.hr.service;

import java.util.List;

import org.hr.pojo.Archives;

public interface ArchivesService {

	/**
	 * 获取所有的员工
	 * @return
	 */
	public List<Archives> getAll();
	
	/**
	 * 根据id获取员工
	 * @param id
	 * @return
	 */
	public Archives getByID(Integer id);
}
