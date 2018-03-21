package org.hr.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hr.dao.ArchivesDao;
import org.hr.pojo.Archives;
import org.hr.service.ArchivesService;
import org.springframework.stereotype.Service;

@Service("archivesService")
public class ArchivesServiceImpl implements ArchivesService {

	@Resource
	private ArchivesDao archivesDao;
	
	public void setArchivesDao(ArchivesDao archivesDao) {
		this.archivesDao = archivesDao;
	}

	@Override
	public List<Archives> getAll() {
		return archivesDao.getAll();
	}

	@Override
	public Archives getByID(Integer id) {
		return archivesDao.getById(id);
	}

}
