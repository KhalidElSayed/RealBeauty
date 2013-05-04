package com.realbeauty.allie.domain;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;

public class FontFactory {

	private final Typeface roboto;

	public FontFactory(Context context) {
		AssetManager assets = context.getAssets();
		roboto = Typeface.createFromAsset(assets, "Roboto-Regular.ttf");
	}

	public Typeface getRoboto() {
		return roboto;
	}

}
