package com.realbeauty.allie.ui.main;

import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;

import com.realbeauty.allie.R;
import com.realbeauty.allie.ui.BlundellActivity;
import com.realbeauty.allie.ui.contact.ContactDetailsFragment;
import com.realbeauty.allie.ui.domain.PagerItem;
import com.realbeauty.allie.ui.location.LocationFragment;
import com.realbeauty.allie.ui.pricing.PricingFragment;

import java.util.ArrayList;
import java.util.List;

public class SectionViewPagerManager {

	private static final List<PagerItem> items = new ArrayList<PagerItem>();
	static {
		items.add(new PagerItem("Treatments", R.drawable.tab_background_pricing, new PricingFragment()));
		items.add(new PagerItem("Location", R.drawable.tab_background_location, new LocationFragment()));
		items.add(new PagerItem("Contact Us", R.drawable.tab_background_contact, new ContactDetailsFragment()));
	}

	private final SectionTabStrip tabStrip;
	private final ViewPager pager;
	private final FragmentManager fragmentManager;

	public SectionViewPagerManager(BlundellActivity activity, int titleId, int pagerId) {
		this.fragmentManager = activity.getSupportFragmentManager();
		this.tabStrip = (SectionTabStrip) activity.findViewById(titleId);
		this.pager = (ViewPager) activity.findViewById(pagerId);
	}

	public void load() {
		tabStrip.setPagerItems(items);
		pager.setAdapter(new SectionPagerAdapter(fragmentManager, items));
		pager.setOnPageChangeListener(tabStrip);
	}

}
