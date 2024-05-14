package com.sachin.di.componentbased.bulbserviceprogram;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class LgBulb implements BulbService{

	
	@Override
	public String getBulb() {
		return "LgBulb";
	}
}
