package com.spyss.springboot.spysswebApp.customExceptions;

public class EventNotFoundException extends Exception {

	private static final long serialVersionUID = -2411738770351557081L;

	public EventNotFoundException(String message) {
		super(message);
	}
	
	public EventNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
}
