package com.revature.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class LoginController {

	// deliver static resources from endpoint "/login"
	@GetMapping(value = "/login")
	public String getStaticLoginPage() {
		return "forward:/resources/Login.html";
	}

	// handle form data sent to "/login"
	@PostMapping(value = "/login", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public RedirectView handleFormRequest(@RequestBody MultiValueMap<String, String> formParams,
			RedirectAttributes attributes) {
		System.out.println(formParams.getFirst("username"));
		attributes.addFlashAttribute("username", formParams.getFirst("username"));
		return new RedirectView("profile");
	}
	
	// profile page to which one is redirected after login
	@GetMapping(value="/profile")
	public ModelAndView getProfilePage(@ModelAttribute("username") String username, ModelMap m) {
		m.addAttribute("username", username);
		return new ModelAndView("profile", m);
	}
}
