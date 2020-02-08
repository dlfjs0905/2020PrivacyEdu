package Sheetz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SheetzController {

	@RequestMapping("/")
	public String hello(){
		return "Hello world!";
	}
	
	

}
