package com.qphone.controller.gaoxi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoreController {
	
	
	@GetMapping("/{url}")
	private String yemian(String url){
		
		return "WEB-INF/"+url;
	}
}
