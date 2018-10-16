package com.spyss.springboot.spysswebApp.service;

import java.util.List;

import com.spyss.springboot.spysswebApp.customExceptions.EventNotFoundException;
import com.spyss.springboot.spysswebApp.model.Event;

public interface EventService {

	List<Event> findAll();
	
	Event findById(Long id) throws EventNotFoundException;
	
	Event save(Event event);
	
	void deleteById(Long id);

}
