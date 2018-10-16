package com.spyss.springboot.spysswebApp.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spyss.springboot.spysswebApp.model.Branch;
import com.spyss.springboot.spysswebApp.repository.BranchRepository;

@Service
@Transactional(readOnly = true)
public class BranchServiceImpl implements BranchService{

	private final BranchRepository branchRepository;
	
	public BranchServiceImpl(BranchRepository branchRepository) {
		this.branchRepository = branchRepository;
	}
	
	@Override
	public List<Branch> findAll() {		
		return branchRepository.findAll();
	}
}
