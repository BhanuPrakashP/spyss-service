package com.spyss.springboot.spysswebApp.service;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spyss.springboot.spysswebApp.customExceptions.EventNotFoundException;
import com.spyss.springboot.spysswebApp.model.Event;
import com.spyss.springboot.spysswebApp.repository.EventRepository;

@Service
@Transactional(readOnly = true)
public class EventServiceImpl implements EventService {

	private final EventRepository repository;

	public EventServiceImpl(EventRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<Event> findAll() {
		return repository.findAll();
	}

	@Override
	public Event findById(Long eventId) throws EventNotFoundException {
		return repository.findById(eventId)
				.orElseThrow(() -> new EventNotFoundException("Could not find Event with ID : [\" + eventId + \"]\")"));
	}

	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@Transactional(readOnly=false)
	@Override
	public Event save(Event event) {
		return repository.save(event);
	}

	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@Transactional(readOnly=false)
	@Override
	public void deleteById(Long eventId) {
		repository.deleteById(eventId);
		
	}
	
	
}
