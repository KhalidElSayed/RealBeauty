package com.realbeauty.allie.domain;

public class Skin extends Treatment {

	private final String description;

	public Skin(String name, Time time, Price price, String description) {
		super(name, time, price);
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

}
