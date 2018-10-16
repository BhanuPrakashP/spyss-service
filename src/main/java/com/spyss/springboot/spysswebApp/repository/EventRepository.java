package com.spyss.springboot.spysswebApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spyss.springboot.spysswebApp.model.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long>{
	
}
