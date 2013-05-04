package com.realbeauty.allie.ui;

import android.app.Application;

import com.realbeauty.allie.domain.FontFactory;

public class BlundellApplication extends Application {

	private FontFactory fontFactory;

	@Override
	public void onCreate() {
		super.onCreate();
		fontFactory = new FontFactory(getApplicationContext());
	}

	public FontFactory getFontFactory() {
		return fontFactory;
	}
}
