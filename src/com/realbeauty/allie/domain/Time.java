package com.realbeauty.allie.domain;

public class Time {

	public static Time _15 = new Time("15mins");
	public static Time _30 = new Time("30mins");
	public static Time _45 = new Time("45mins");
	public static Time _60 = new Time("60mins");
	public static Time _75 = new Time("75mins");
	public static Time _90 = new Time("90mins");
	private final String formattedTime;

	private Time(String formattedTime) {
		this.formattedTime = formattedTime;
	}

	@Override
	public String toString() {
		return formattedTime;
	}
}
