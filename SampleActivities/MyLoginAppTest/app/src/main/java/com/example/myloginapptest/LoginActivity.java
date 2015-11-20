package com.example.myloginapptest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity {

	public static final String USERNAME_KEY = "username";
	public static final String PASSWORD_KEY = "password";
	private EditText mUserNameEditText;
	private EditText mPasswordEditText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);

		mUserNameEditText = (EditText) findViewById(R.id.username_edit_text);
		mPasswordEditText = (EditText) findViewById(R.id.password_edit_text);

		Button signInButton = (Button) findViewById(R.id.button_sign_in);
		signInButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
				login();
			}
		});
	}

	private void login() {
		Intent intent = new Intent();
		intent.putExtra(USERNAME_KEY, mUserNameEditText.getText().toString());
		intent.putExtra(PASSWORD_KEY, mPasswordEditText.getText().toString());
		intent.setAction("com.example.intentpoc.HomeActivity");
		intent.addCategory(Intent.CATEGORY_DEFAULT);
		startActivity(intent);
	}
}

