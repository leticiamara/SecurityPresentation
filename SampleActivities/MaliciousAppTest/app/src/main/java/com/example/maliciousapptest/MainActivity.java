package com.example.maliciousapptest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

	private TextView mUserNameText;
	private TextView mPasswordText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mUserNameText = (TextView) findViewById(R.id.text_view_user_name);
		mPasswordText = (TextView) findViewById(R.id.text_view_password);
		fillsUserInfo();
	}

	private void fillsUserInfo() {
		String username = this.getIntent().getStringExtra("username");
		mUserNameText.setText(getString(R.string.user_name_with_value, username));
		String password = this.getIntent().getStringExtra("password");
		mPasswordText.setText(getString(R.string.password_with_value, password));
	}

	@Override
	protected void onResume() {
		super.onResume();
		fillsUserInfo();
	}
}
