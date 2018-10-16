package com.spyss.springboot.spysswebApp.controller;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spyss.springboot.spysswebApp.model.RegistrationForm;
import com.spyss.springboot.spysswebApp.service.RegistrationService;

@RestController
public class RegistrationController {

	private static final String FORM_VIEW_NAME="registration/form";
	
	private static final Log log = LogFactory.getLog(RegistrationController.class);
	
	private final RegistrationService registrationService;

	public RegistrationController(RegistrationService registrationService) {
			this.registrationService = registrationService;
	}
	
	@GetMapping("/form")
	public String submit(@Valid RegistrationForm registrationForm, BindingResult bindingResult) {
		log.debug("Saving the Registration From");
		
		if (bindingResult.hasErrors()) {
			log.debug("Redisplaying event form");
			return FORM_VIEW_NAME;
		}
		log.debug("Submitting event form: " + registrationForm);
		registrationService.save(registrationForm);
		return "redirect:/";
	}
}
