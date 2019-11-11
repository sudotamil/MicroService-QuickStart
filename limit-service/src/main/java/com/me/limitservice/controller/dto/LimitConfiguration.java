package com.me.limitservice.controller.dto;

public class LimitConfiguration {
	
	private int maximum;
	private int minimum;
	public LimitConfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}
	
	protected LimitConfiguration() {
		
	}

	public int getMaximum() {
		return maximum;
	}

	public int getMinimum() {
		return minimum;
	}
	
	
	
	

}
