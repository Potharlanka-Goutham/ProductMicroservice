package com.klef.jfsd.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class ClientController {
	
	    @GetMapping("/")
	    public String index() {
	        return "index"; // JSP file: /WEB-INF/views/index.jsp
	    }

	  
	 @GetMapping("/index")
	 public ModelAndView home() 
	 {
		 ModelAndView mv = new ModelAndView("index");
		 return mv;
	 }

}
