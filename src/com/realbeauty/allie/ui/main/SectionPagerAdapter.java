package com.realbeauty.allie.ui.main;

import android.support.v4.app.*;


import java.util.List;

public class SectionPagerAdapter extends FragmentStatePagerAdapter {

	private final List<PagerItem> items;

	public SectionPagerAdapter(FragmentManager fm, List<PagerItem> items) {
		super(fm);
		this.items = items;
	}

	@Override
	public Fragment getItem(int position) {
		return items.get(position).getFragment();
	}

	@Override
	public int getCount() {
		return items.size();
	}

	@Override
	public CharSequence getPageTitle(int position) {
		return items.get(position).getTitle();
	}

}
