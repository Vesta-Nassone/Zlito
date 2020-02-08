package com.example.zlito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // initialize widgets
        Button loginButton = findViewById(R.id.loginBtn);
        //EditText userEmail = findViewById(R.id.userEmail);
        //TextView forgotPassword = findViewById(R.id.forgotPasswordTextView);
        //EditText password = findViewById(R.id.password);

        //Calculator Button Listener
        loginButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(getApplicationContext(), Homepage.class);
                //passing info into the new Activity
                startActivity(loginIntent);
            }
        });

    }
}
