package net.balgre.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {
	
	@RequestMapping("/")
	@ResponseBody
	public String home() {
		return "Hello World, Balgre Test 02 03";
	}

}
