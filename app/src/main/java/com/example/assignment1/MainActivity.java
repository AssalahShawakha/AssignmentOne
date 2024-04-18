package com.example.assignment1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText edtUserName, edtPassword;
    private Button btLogin, btNewAccount;
    SharedPreferences preferences;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        setupViews();
        preferences = getSharedPreferences("Userinfo", 0);
        Login();
        Create();
    }

    private void Login() {
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String User = edtUserName.getText().toString();
                String Password = edtPassword.getText().toString();
                String registeredUserName = preferences.getString("User Name","");
                String registeredPassword = preferences.getString("Password","");

                if(User.equals(registeredUserName) && Password.equals(registeredPassword)){
                    Intent intent = new Intent(MainActivity.this,Welcome.class);
                    startActivity(intent);
                }
            }
        });
    }

    private void Create() {
        btNewAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,NewAccount.class);
                startActivity(intent);
            }
        });
    }
    private void setupViews() {
        edtUserName = findViewById(R.id.edtUserName);
        edtPassword = findViewById(R.id.edtPassword);
        btLogin = findViewById(R.id.btLogin);
        btNewAccount = findViewById(R.id.btNewAccount);
    }
}