package com.realbeauty.allie.domain;

public class Price {

	public static final Price _8 = new Price("£8");
	public static final Price _10 = new Price("£10");
	public static final Price _12 = new Price("£12");
	public static final Price _15 = new Price("£15");
	public static final Price _20 = new Price("£20");
	public static final Price _22 = new Price("£22");
	public static final Price _25 = new Price("£25");
	public static final Price _27 = new Price("£27");
	public static final Price _30 = new Price("£30");
	public static final Price _32 = new Price("£32");
	public static final Price _37 = new Price("£37");
	public static final Price _40 = new Price("£40");
	public static final Price _45 = new Price("£45");
	public static final Price _50 = new Price("£50");
	public static final Price _60 = new Price("£60");
	public static final Price _65 = new Price("£65");
	private final String formattedPrice;

	private Price(String formattedPrice) {
		this.formattedPrice = formattedPrice;
	}

	@Override
	public String toString() {
		return formattedPrice;
	}
}
