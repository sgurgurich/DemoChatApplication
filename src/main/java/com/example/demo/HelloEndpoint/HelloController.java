package com.example.demo.HelloEndpoint;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
public class HelloController {
    
	@GetMapping(value="/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name){
		return String.format("Hello %s!", name);
	}

	@RequestMapping(value="user", method=RequestMethod.GET)
	public @ResponseBody String requestMethodName(@RequestParam("data") String param) {
		return "Done";
	}
	
}
