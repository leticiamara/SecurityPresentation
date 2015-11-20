package com.example.myloginapptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);

		Bundle extras = getIntent().getExtras();
		String userName = extras.getString(LoginActivity.USERNAME_KEY);
		String password = extras.getString(LoginActivity.PASSWORD_KEY);

		TextView userNameText = (TextView) findViewById(R.id.text_view_user_name);
		TextView passwordText = (TextView) findViewById(R.id.text_view_password);

		userNameText.setText(getString(R.string.user_name_with_value, userName));
		passwordText.setText(getString(R.string.password_with_value, password));
	}
}
