package com.example.mybroadcastreceiverapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class UseBroadcastReceiverActivity extends AppCompatActivity implements View.OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_use_broadcast_receiver);
		findViewById(R.id.sendBroadcast).setOnClickListener(this);
	}

	@Override
	public void onClick(View view) {
		if(view.getId() == R.id.sendBroadcast) {
			EditText editTextPhone = (EditText) findViewById(R.id.edit_text_phone);
			String phoneNumber = editTextPhone.getText().toString();
			Intent intent = new Intent();
			intent.setAction("MyBroadcast");
			intent.putExtra(MyBroadcastReceiver.EXTRA_KEY, phoneNumber);
			sendBroadcast(intent);
		}
	}
}
