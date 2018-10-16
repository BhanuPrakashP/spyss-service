package com.spyss.springboot.spysswebApp.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spyss.springboot.spysswebApp.service.BranchService;

@RestController
public class BranchController {
	
	private static final String BRANCH_LIST_VIEW="branches/list";
	
	private static final Log log = LogFactory.getLog(BranchController.class);
	
	private final BranchService branchService;
	
	public BranchController(BranchService branchService) {
		this.branchService = branchService;
	}
	
	@GetMapping("/branches")
	public String getBranchDetails(Model model) {
		log.debug("Displaying all branches");
		model.addAttribute("branches", branchService.findAll());
		return BRANCH_LIST_VIEW;
	}

}
