package com.spyss.springboot.spysswebApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spyss.springboot.spysswebApp.model.Branch;

public interface BranchRepository extends JpaRepository<Branch, Long>{

}
