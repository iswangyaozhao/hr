package org.hr.controller;

import java.util.List;

import javax.annotation.Resource;

import org.hr.pojo.Archives;
import org.hr.service.ArchivesService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/archives")
public class ArchivesController {
	
	@Resource
	private ArchivesService archivesService;
	
	public void setArchivesService(ArchivesService archivesService) {
		this.archivesService = archivesService;
	}

	//查询所有员工
	@RequestMapping(value="/all",method=RequestMethod.POST)
	@ResponseBody
	public List<Archives> all() throws Exception{
		return archivesService.getAll();
	}
	
	
	@RequestMapping(value="toarchives",method=RequestMethod.POST)
	@ResponseBody
	public Archives toArchives(Integer id) throws Exception{
		return archivesService.getByID(id);
	}
	
	
	
	
	
	/*@RequestMapping(value="add",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> add(User user,Integer[] roleIds) throws Exception{
		return userSerice.addUser(user);
	}
	
	@RequestMapping("/list")
	@ResponseBody
	public Map<String, Object> list(@RequestParam(defaultValue="1")Integer page, @RequestParam(defaultValue="10")Integer rows,@RequestParam(defaultValue="id") String sort,@RequestParam(defaultValue="asc") String order,User condition) throws Exception{
		
		return userSerice.listMap(page, rows, sort, order, condition);
	}*/
}
