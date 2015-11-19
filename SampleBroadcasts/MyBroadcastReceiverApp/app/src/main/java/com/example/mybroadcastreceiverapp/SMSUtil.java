package com.example.mybroadcastreceiverapp;

import android.content.Context;
import android.telephony.SmsManager;

/**
 * Util class to work with SMS
 *
 * Created by Letícia Nunes on 19/11/2015.
 */
public class SMSUtil {

	public static void sendMessage(final Context context, String phoneNumber, String message) {
		SmsManager smsManager = SmsManager.getDefault();
		smsManager.sendTextMessage(phoneNumber, null, message, null, null);
	}
}
