package com.realbeauty.allie.ui.contact;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.view.View.OnClickListener;

import com.actionbarsherlock.app.SherlockFragment;
import com.realbeauty.allie.R;
import com.realbeauty.allie.nav.Navigator;

public class ContactDetailsFragment extends SherlockFragment {

	private Navigator navigator;

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		navigator = new Navigator(activity);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View root = inflater.inflate(R.layout.fragment_contact_details, container, false);

		root.findViewById(R.id.fragment_contact_details_telephone).setOnClickListener(onTelephoneClick);
		root.findViewById(R.id.fragment_contact_details_email).setOnClickListener(onEmailClick);

		return root;
	}

	private final OnClickListener onTelephoneClick = new OnClickListener() {
		@Override
		public void onClick(View v) {
			navigator.toTelephoneSalon();
		}
	};

	private final OnClickListener onEmailClick = new OnClickListener() {
		@Override
		public void onClick(View v) {
			navigator.toEmailSalon();
		}
	};

}
