package com.realbeauty.allie.ui.main;

import android.os.Bundle;

import com.realbeauty.allie.R;
import com.realbeauty.allie.ui.BlundellActivity;

public class MainActivity extends BlundellActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		boolean isTablet = getResources().getBoolean(R.bool.isTablet);

		if (!isTablet) {
			SectionViewPagerManager sectionViewPagerManager = new SectionViewPagerManager(this, R.id.main_title_image, R.id.main_view_pager);
			sectionViewPagerManager.load();
		}
	}

}
