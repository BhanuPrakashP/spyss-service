package com.spyss.springboot.spysswebApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spyss.springboot.spysswebApp.model.RegistrationForm;

@Repository
public interface RegistrationRepository extends JpaRepository<RegistrationForm, Long>{
	
}
