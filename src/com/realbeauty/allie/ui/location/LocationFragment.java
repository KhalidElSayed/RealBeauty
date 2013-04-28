package com.realbeauty.allie.ui.location;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.*;
import android.view.View.OnClickListener;

import com.realbeauty.allie.R;
import com.realbeauty.allie.nav.Navigator;

public class LocationFragment extends Fragment implements OnClickListener {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View root = inflater.inflate(R.layout.fragment_location, container, false);

		root.findViewById(R.id.location_map_position).setOnClickListener(this);

		return root;
	}

	@Override
	public void onClick(View v) {
		new Navigator(getActivity()).toSalonLocationOnMap();
	}
}
