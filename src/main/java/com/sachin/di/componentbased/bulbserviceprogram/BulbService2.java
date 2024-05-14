package com.sachin.di.componentbased.bulbserviceprogram;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class BulbService2 {

	@Autowired
	BulbService bulb;
	
	public BulbService getBulb() {
		return bulb;
	}

	public void setBulb(BulbService bulb) {
		this.bulb = bulb;
	}

	public String askBulb() {
		return bulb.getBulb();
	}
}
