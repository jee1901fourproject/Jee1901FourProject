package com.qphone.zhiquanController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class addr {
	
	
	@RequestMapping("/aa")
	public String t(){
		
		
		return "WEB-INF/jsp/index.jsp";
	}
	
	@GetMapping("/index")
	private String index(){
		return "WEB-INF/jsp/admin-list.jsp";
	}
	

}
