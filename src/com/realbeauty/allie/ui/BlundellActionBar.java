package com.realbeauty.allie.ui;

import com.actionbarsherlock.view.*;
import com.realbeauty.allie.R;

public class BlundellActionBar {

	public interface OnActionBarClickListener {
		void onFacebookButtonClicked();

		void onTelephoneButtonClicked();
	}

	private final MenuInflater inflater;
	private final OnActionBarClickListener clickListener;

	public BlundellActionBar(MenuInflater menuInflater, OnActionBarClickListener clickListener) {
		this.inflater = menuInflater;
		this.clickListener = clickListener;
	}

	public boolean onCreateMenu(Menu menu) {
		inflater.inflate(R.menu.menu_main, menu);
		return true;
	}

	public boolean onMenuItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.menu_item_facebook:
			clickListener.onFacebookButtonClicked();
			return true;
		case R.id.menu_item_phone:
			clickListener.onTelephoneButtonClicked();
			return true;
		default:
			return false;
		}
	}
}
