package com.realbeauty.allie.ui.main;

import android.os.Bundle;

import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.realbeauty.allie.R;
import com.realbeauty.allie.ui.BlundellActivity;

public class MainActivity extends BlundellActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		SectionViewPagerManager sectionViewPagerManager = new SectionViewPagerManager(this, R.id.main_pager_title_strip, R.id.main_view_pager);
		sectionViewPagerManager.load();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getSupportMenuInflater();
		inflater.inflate(R.menu.menu_main, menu);
		return true;
	}

}
