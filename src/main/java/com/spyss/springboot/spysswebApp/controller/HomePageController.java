package com.spyss.springboot.spysswebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePageController {

	@RequestMapping("/spyss")
	public String homePagecontents() {
		return "homePage";
	}
}
