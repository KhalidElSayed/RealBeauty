package com.realbeauty.allie.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import com.realbeauty.allie.domain.FontFactory;
import com.realbeauty.allie.ui.BlundellApplication;

public class FontTextView extends TextView {

	public FontTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
		initialise();
	}

	public FontTextView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		initialise();
	}

	private void initialise() {
		FontFactory fontFactory = ((BlundellApplication) getContext().getApplicationContext()).getFontFactory();
		setTypeface(fontFactory.getRoboto());
	}
}
