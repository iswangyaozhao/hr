package org.hr.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hr")
public class BookController {

	
	@RequestMapping("/index")
	public String list() throws Exception{
		return "index";
	}
}
