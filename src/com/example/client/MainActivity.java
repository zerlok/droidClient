package com.example.client;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

	EditText loginEmail;
	EditText loginPassword;
	Button loginButton;
	Button signupButton;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		loginEmail = (EditText) findViewById(R.id.loginEmail);
		loginPassword = (EditText) findViewById(R.id.loginPassword);
		loginButton = (Button) findViewById(R.id.loginButton);
		signupButton = (Button) findViewById(R.id.signupButton);

		loginButton.setOnClickListener(this);
		signupButton.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.loginButton:
			if (loginEmail.getText().toString().isEmpty()
					|| loginPassword.getText().toString().isEmpty()) {
				Toast.makeText(this, "Please fill in the fields",
						Toast.LENGTH_LONG).show();
				return;
			}
			Intent intent = new Intent(this, FeedActivity.class);
			startActivity(intent);
			break;
		case R.id.signupButton:
			Intent intent1 = new Intent(this, SignupActivity.class);
			startActivity(intent1);
			break;
		}

	}
}
