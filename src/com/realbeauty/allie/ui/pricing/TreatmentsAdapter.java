package com.realbeauty.allie.ui.pricing;

import android.content.Context;
import android.view.*;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.realbeauty.allie.R;
import com.realbeauty.allie.domain.Treatment;
import com.realbeauty.allie.domain.TreatmentFactory;

import java.util.List;

public class TreatmentsAdapter extends BaseExpandableListAdapter {

	private static final List<String> groups = TreatmentFactory.TITLES;
	private static final List<List<Treatment>> children = TreatmentFactory.TREATMENTS;

	private final LayoutInflater mInflater;

	public TreatmentsAdapter(Context context) {
		mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	@Override
	public Object getChild(int groupPosition, int childPosition) {
		return children.get(groupPosition).get(childPosition);
	}

	@Override
	public long getChildId(int groupPosition, int childPosition) {
		return childPosition;
	}

	@Override
	public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
		View v;
		if (convertView == null) {
			v = newChildView(parent);
		} else {
			v = convertView;
		}
		bindView(v, children.get(groupPosition).get(childPosition));
		return v;
	}

	public View newChildView(ViewGroup parent) {
		return mInflater.inflate(R.layout.list_item_treatment, parent, false);
	}

	private void bindView(View v, Treatment treatment) {
		TextView treatmentTitle = (TextView) v.findViewById(R.id.treatment_title);
		treatmentTitle.setText(treatment.getName());
		TextView treatmentTime = (TextView) v.findViewById(R.id.treatment_time);
		treatmentTime.setText(treatment.getTime().toString());
		TextView treatmentPrice = (TextView) v.findViewById(R.id.treatment_price);
		treatmentPrice.setText(treatment.getPrice().toString());
	}

	@Override
	public int getChildrenCount(int groupPosition) {
		return children.get(groupPosition).size();
	}

	@Override
	public Object getGroup(int groupPosition) {
		return groups.get(groupPosition);
	}

	@Override
	public int getGroupCount() {
		return groups.size();
	}

	@Override
	public long getGroupId(int groupPosition) {
		return groupPosition;
	}

	@Override
	public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
		View v;
		if (convertView == null) {
			v = newGroupView(parent);
		} else {
			v = convertView;
		}

		((TextView) v.findViewById(android.R.id.text1)).setText(groups.get(groupPosition));

		return v;
	}

	public View newGroupView(ViewGroup parent) {
		return mInflater.inflate(android.R.layout.simple_list_item_1, parent, false);
	}

	@Override
	public boolean isChildSelectable(int groupPosition, int childPosition) {
		return true;
	}

	@Override
	public boolean hasStableIds() {
		return true;
	}
}
