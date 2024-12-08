package com.klef.jfsd.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
	
	  @GetMapping("/")
    public void home(HttpServletRequest request) {
        // Forward the request to the JSP file
        try {
            request.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(request, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
