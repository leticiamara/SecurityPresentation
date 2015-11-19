package com.example.mybroadcastreceiverapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/**
 * POC from site: http://resources.infosecinstitute.com/android-hacking-security-part-3-exploiting-
 * broadcast-receivers/
 *
 * Created by Letícia Nunes on 13/10/2015.
 */
public class MyBroadcastReceiver extends BroadcastReceiver {

	public static final String EXTRA_KEY = "number";

	@Override
	public void onReceive(Context context, Intent intent) {
		Bundle bundle = intent.getExtras();
		if(bundle != null) {
			if(bundle.containsKey(EXTRA_KEY)) {
				Object number = bundle.get(EXTRA_KEY);
				String phoneNumber = number != null ? number.toString() : "";
				String message = context.getString(R.string.test_message);
				SMSUtil.sendMessage(context, phoneNumber, message);
			}
		}
	}
}
