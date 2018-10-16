package com.spyss.springboot.spysswebApp.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spyss.springboot.spysswebApp.model.RegistrationForm;
import com.spyss.springboot.spysswebApp.repository.RegistrationRepository;

@Service
@Transactional(readOnly=true)
public class RegistrationServiceImpl implements RegistrationService{

	private final RegistrationRepository registrationRepository;

	public RegistrationServiceImpl(RegistrationRepository registrationrepository) {
		this.registrationRepository = registrationrepository;
	}

	@Transactional(readOnly=false)
	@Override
	public RegistrationForm save(RegistrationForm registrationForm) {
		return registrationRepository.save(registrationForm);
	}
}
