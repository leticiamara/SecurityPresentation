package com.example.mybroadcastreceiverapp;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class UseLocalBroadcastActivity extends AppCompatActivity implements View.OnClickListener {

	public static final String MY_LOCAL_BROADCAST_ACTION = "MyLocalBroadcast";
	private MyLocalBroadcastReceiver mMyBroadcastReceiver;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_use_local_broadcast);
		findViewById(R.id.send_broadcast).setOnClickListener(this);

		mMyBroadcastReceiver = new MyLocalBroadcastReceiver();

		LocalBroadcastManager.getInstance(this).registerReceiver(mMyBroadcastReceiver,
				new IntentFilter(MY_LOCAL_BROADCAST_ACTION));
	}

	@Override
	public void onClick(View view) {
		if(view.getId() == R.id.send_broadcast) {
			EditText editTextPhone = (EditText) findViewById(R.id.edit_text_phone);
			String phoneNumber = editTextPhone.getText().toString();
			Intent intent = new Intent();
			intent.setAction(MY_LOCAL_BROADCAST_ACTION);
			intent.putExtra(MyBroadcastReceiver.EXTRA_KEY, phoneNumber);
			LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
		}
	}

	@Override
	protected void onResume() {
		super.onResume();
		LocalBroadcastManager.getInstance(this).registerReceiver(mMyBroadcastReceiver,
				new IntentFilter(MY_LOCAL_BROADCAST_ACTION));
	}

	@Override
	protected void onPause() {
		super.onPause();
		LocalBroadcastManager.getInstance(this).unregisterReceiver(mMyBroadcastReceiver);
	}
}
