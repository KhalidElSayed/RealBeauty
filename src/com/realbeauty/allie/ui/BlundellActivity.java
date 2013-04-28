package com.realbeauty.allie.ui;

import android.os.Bundle;

import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.realbeauty.allie.nav.Navigator;
import com.realbeauty.allie.ui.BlundellActionBar.OnActionBarClickListener;

public class BlundellActivity extends SherlockFragmentActivity implements OnActionBarClickListener {

	private BlundellActionBar actionBar;
	private Navigator navigator;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		actionBar = new BlundellActionBar(getSupportMenuInflater(), this);
		navigator = new Navigator(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		return actionBar.onCreateMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		return actionBar.onMenuItemSelected(item);
	}

	@Override
	public void onFacebookButtonClicked() {
		gotoFacebookPage();
	}

	@Override
	public void onTelephoneButtonClicked() {
		startPhoneCall();
	}

	private void gotoFacebookPage() {
		navigator.toSalonFacebookPage();
	}

	private void startPhoneCall() {
		navigator.toTelephoneSalon();
	}

}
