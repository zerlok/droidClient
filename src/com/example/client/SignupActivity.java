package com.example.client;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class SignupActivity extends Activity implements OnClickListener {
	
	EditText email, password, password_confirm;
	Button signup;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_signup);
		
		email = (EditText) findViewById(R.id.signup_email);
		password = (EditText) findViewById(R.id.signup_password);
		password_confirm = (EditText) findViewById(R.id.signup_password_confirm);
		signup = (Button) findViewById(R.id.signup_button);
	}

	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
}
