package com.spyss.springboot.spysswebApp.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spyss.springboot.spysswebApp.service.EventService;

@RestController
public class EventsController {
	
	private static final String EVENTS_LIST_VIEW="events/list";
	private static final String EVENTS_OVERVIEW="event/overview";
	private static final String EVENT_LOCATION_VIEW="event/location";
	private static final String PREVIOUS_EVENTs_VIEW="events/previousevent";
	
	private static final Log log = LogFactory.getLog(EventsController.class);
	
	private final EventService eventService;

	public EventsController(EventService eventService) {
			this.eventService = eventService;
		}

	@GetMapping("/list")
	public String list(Model model) {
		log.debug("Displaying all events");
		model.addAttribute("events", eventService.findAll());
		return EVENTS_LIST_VIEW;
	}
}
