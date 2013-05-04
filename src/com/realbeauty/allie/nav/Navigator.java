package com.realbeauty.allie.nav;

import android.content.*;
import android.net.Uri;
import android.util.Log;
import android.widget.Toast;

public class Navigator {

	private static final String SALON_FACEBOOK_PAGE_NAME = "Realbeautywithallie";
	private static final String SALON_FACEBOOK_PAGE_ID = "188354171296531";
	private static final String SALON_PHONE_NUMBER = "07912176997";
	private static final String SALON_EMAIL = "realbeautywithallie@hotmail.co.uk";
	private final Context context;

	public Navigator(Context context) {
		this.context = context;
	}

	public void toSalonLocationOnMap() {
		try {
			Intent intent = new Intent(
					Intent.ACTION_VIEW,
					Uri.parse("https://maps.google.co.uk/maps?q=kingsway+court+bn3+3lp&hl=en&ll=50.824637,-0.166522&spn=0.004907,0.011501&sll=50.826067,-0.173206&sspn=0.009813,0.023003&hq=kingsway+court&hnear=Hove+BN3+3LP,+United+Kingdom&t=m&z=17"));
			startNewTask(intent);
		} catch (ActivityNotFoundException e) {
			toSearchGooglePlayFor("google maps");
		}
	}

	public void toTelephoneSalon() {
		try {
			Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + SALON_PHONE_NUMBER));
			startNewTask(intent);
		} catch (ActivityNotFoundException ignore) {
			// fail silently
		}
	}

	public void toEmailSalon() {
		try {
			Intent intent = new Intent(Intent.ACTION_SEND);
			String[] recipients = { SALON_EMAIL };
			intent.putExtra(Intent.EXTRA_EMAIL, recipients);
			intent.putExtra(Intent.EXTRA_SUBJECT, "Contact Us - Enquiry");
			intent.setType("text/plain");
			startNewTask(intent);
		} catch (ActivityNotFoundException e) {
			toSearchGooglePlayFor("email");
		}
	}

	private void toSearchGooglePlayFor(String searchFor) {
		try {
			Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("market://search?q=" + searchFor + "&c=apps"));
			context.startActivity(intent);
		} catch (ActivityNotFoundException ignore) {
			Toast.makeText(context, "Need Google Play installed", Toast.LENGTH_SHORT).show();
		}
	}

	public void toSalonFacebookPage() {
		try {
			Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/" + SALON_FACEBOOK_PAGE_ID));
			startNewTask(intent);
		} catch (ActivityNotFoundException e) {
			Log.d("TAG", "Facebook app not found", e);
			Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/pages/" + SALON_FACEBOOK_PAGE_NAME + "/" + SALON_FACEBOOK_PAGE_ID));
			startNewTask(intent2);
		}
	}

	private void startNewTask(Intent intent) {
		intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		context.startActivity(intent);
	}

}
