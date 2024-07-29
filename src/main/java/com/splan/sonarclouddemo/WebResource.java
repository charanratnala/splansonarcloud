package com.splan.sonarclouddemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api")
public class WebResource {
	
	@GetMapping("/getMessage")
	public String get() {
		return " Hloo mann !";
	}

}
