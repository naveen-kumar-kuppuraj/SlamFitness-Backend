package com.SpringBoot.SlamFitness.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/homecontroller")
@RestController

public class homeController {
	@GetMapping("/home")
	String welcome()
	
	{
		return "hello";
	}
	

	

}
