package com.realbeauty.allie.domain;

public class Treatment {

	private final String name;
	private final Time time;
	private final Price price;

	public Treatment(String name, Time time, Price price) {
		this.name = name;
		this.time = time;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public Time getTime() {
		return time;
	}

	public Price getPrice() {
		return price;
	}

}
