package com.strontsitskyi.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/registration")
public class RegistrationController {

	@RequestMapping(method = RequestMethod.GET)
	public String getName(Model model) {
		model.addAttribute("message", "Vova");
		return "registration";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String registr(Model model) {
		model.addAttribute("message", "Vova");
		return "user";
	}
}
