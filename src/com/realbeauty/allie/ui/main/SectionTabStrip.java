package com.realbeauty.allie.ui.main;

import android.content.Context;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.AttributeSet;

import com.realbeauty.allie.ui.domain.PagerItem;

import java.util.List;

public class SectionTabStrip extends PagerTabStrip implements OnPageChangeListener {

	private List<PagerItem> items;

	public SectionTabStrip(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public void setPagerItems(List<PagerItem> items) {
		this.items = items;
		setBackgroundResource(items.get(0).getImageId());
	}

	@Override
	public void onPageSelected(int position) {
		setBackgroundResource(items.get(position).getImageId());
	}

	@Override
	public void onPageScrollStateChanged(int state) {
	}

	@Override
	public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
	}
}
