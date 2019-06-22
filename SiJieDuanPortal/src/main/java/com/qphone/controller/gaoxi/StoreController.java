package com.qphone.controller.gaoxi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StoreController {
	
	
	/*@RequestMapping("/{url}")
	public String yemian(@PathVariable(value="url")String url){
		System.out.println(url+"url..");
		
		return "WEB-INF/jsp/"+url+".jsp";
	}*/
	
	/*WEB-INF/jsp/content-panel.jsp
	 * Ê×Ò³°å¿é·ÃÎÊ
	 */
	@GetMapping("/index1")
	public String t1(){
		return "WEB-INF/jsp/"+"content-panel.jsp";
	}
}
