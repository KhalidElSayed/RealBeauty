package com.realbeauty.allie.ui.pricing;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.*;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnGroupExpandListener;

import com.realbeauty.allie.R;

public class PricingFragment extends Fragment {

	private ExpandableListView list;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View root = inflater.inflate(R.layout.fragment_pricing, container, false);

		list = (ExpandableListView) root.findViewById(R.id.pricing_list);

		return root;
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

		list.setAdapter(new TreatmentsAdapter(getActivity()));
		onlyAllowOneGroupToBeOpenAtOneTime();
	}

	private void onlyAllowOneGroupToBeOpenAtOneTime() {
		list.setOnGroupExpandListener(new OnGroupExpandListener() {
			int previousGroup = -1;

			@Override
			public void onGroupExpand(int groupPosition) {
				if (groupPosition != previousGroup)
					list.collapseGroup(previousGroup);
				previousGroup = groupPosition;
			}
		});
	}

}
