package com.strontsitskyi.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.strontsitskyi.spring.model.User;
import com.strontsitskyi.spring.service.UserService;

@Controller
@RequestMapping("/user")
public class UserPageController {

	// @Autowired
	// UserService userService;

	@RequestMapping(method = RequestMethod.GET)
	public String getName(Model model,
			@RequestParam(required = true, defaultValue = "1", value = "id") int id) {
		// User user = userService.getUserById(id);
		User user = new User();
		user.setName("LOVA");
		model.addAttribute("id", id);
		return "user";
	}
}
