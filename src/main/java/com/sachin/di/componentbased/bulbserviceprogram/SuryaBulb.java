package com.sachin.di.componentbased.bulbserviceprogram;

import org.springframework.stereotype.Component;

@Component
public class SuryaBulb implements BulbService {

	@Override
	public String getBulb() {
		return "surya";
		
	}

	


}
