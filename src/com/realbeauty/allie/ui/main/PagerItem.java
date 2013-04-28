package com.realbeauty.allie.ui.main;

import android.support.v4.app.Fragment;

public class PagerItem {
	private final String title;
	private final int imageId;
	private final Fragment fragment;

	public PagerItem(String title, int imageId, Fragment fragment) {
		this.title = title;
		this.imageId = imageId;
		this.fragment = fragment;
	}

	public String getTitle() {
		return title;
	}

	public int getImageId() {
		return imageId;
	}

	public Fragment getFragment() {
		return fragment;
	}
}