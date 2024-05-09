package com.sachin.androjava;

public class BulbService2 {

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
