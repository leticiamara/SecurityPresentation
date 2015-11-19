package com.example.mybroadcastreceiverapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Sample from blog: http://resources.infosecinstitute.com/
 * android-hacking-security-part-3-exploiting-broadcast-receivers/
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findViewById(R.id.buttonPOCBroadcastReceiver).setOnClickListener(this);
		findViewById(R.id.buttonPOCLocalBroadcastReceiver).setOnClickListener(this);
	}

	@Override
	public void onClick(View view) {
		if(view.getId() == R.id.buttonPOCBroadcastReceiver) {
			startActivity(new Intent(this, UseBroadcastReceiverActivity.class));
		} else if(view.getId() == R.id.buttonPOCLocalBroadcastReceiver) {
			startActivity(new Intent(this, UseLocalBroadcastActivity.class));
		}
	}
}
