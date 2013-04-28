package com.realbeauty.allie.ui.main;

import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.widget.ImageView;

import com.realbeauty.allie.R;
import com.realbeauty.allie.ui.BlundellActivity;
import com.realbeauty.allie.ui.contact.ContactDetailsFragment;
import com.realbeauty.allie.ui.location.LocationFragment;
import com.realbeauty.allie.ui.pricing.PricingFragment;

import java.util.ArrayList;
import java.util.List;

public class SectionViewPagerManager implements OnPageChangeListener {

	private static final List<PagerItem> items = new ArrayList<PagerItem>();
	static {
		items.add(new PagerItem("Treatments", R.drawable.tab_background_pricing, new PricingFragment()));
		items.add(new PagerItem("Location", R.drawable.tab_background_location, new LocationFragment()));
		items.add(new PagerItem("Contact Me", R.drawable.tab_background_contact, new ContactDetailsFragment()));
	}

	private final ViewPager pager;
	private final FragmentManager fragmentManager;
	private final ImageView titleImage;

	public SectionViewPagerManager(BlundellActivity activity, int titleImageId, int pagerId) {
		this.fragmentManager = activity.getSupportFragmentManager();
		this.pager = (ViewPager) activity.findViewById(pagerId);
		this.titleImage = (ImageView) activity.findViewById(titleImageId);
	}

	public void load() {
		pager.setAdapter(new SectionPagerAdapter(fragmentManager, items));
		pager.setOnPageChangeListener(this);
	}

	@Override
	public void onPageSelected(int position) {
		setItemTitleImage(position);
	}

	private void setItemTitleImage(int position) {
		titleImage.setImageResource(items.get(position).getImageId());
	}

	@Override
	public void onPageScrollStateChanged(int arg0) {
	}

	@Override
	public void onPageScrolled(int arg0, float arg1, int arg2) {
	}

}
