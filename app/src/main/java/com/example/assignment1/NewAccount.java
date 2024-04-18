package com.example.assignment1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class NewAccount extends AppCompatActivity {
    private EditText edtUser,edtPass,edtDate,edtCountry,edtPhone,edtAddress,edtEmail;
    private RadioGroup Gendar;
    private Button btCreate, btCancel;

    SharedPreferences preferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_new_account);
        setupViews();
        preferences = getSharedPreferences("Userinfo", 0);
        create();
        cancel();
    }
    private void create() {
        btCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = edtUser.getText().toString();
                String password = edtPass.getText().toString();
                String Date = edtDate.getText().toString();
                String Country = edtCountry.getText().toString();
                String Phone = edtPhone.getText().toString();
                String Address = edtAddress.getText().toString();
                String Email = edtEmail.getText().toString();
                RadioButton check = findViewById(Gendar.getCheckedRadioButtonId());
                String gendar = check.getText().toString();

                if(userName.length() > 1) {
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putString("User Name", userName);
                    editor.putString("Password", password);
                    editor.putString("Date", Date);
                    editor.putString("Country", Country);
                    editor.putString("Phone", Phone);
                    editor.putString("Address", Address);
                    editor.putString("Email", Email);
                    editor.putString("gendar", gendar);

                    editor.apply();
                    Toast.makeText(NewAccount.this, "Successfully", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(NewAccount.this, "Enter value in the field ", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private void cancel() {
        btCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NewAccount.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
    private void setupViews() {
        edtUser = findViewById(R.id.edtUser);
        edtPass = findViewById(R.id.edtPass);
        edtDate = findViewById(R.id.edtDate);
        edtCountry = findViewById(R.id.edtCountry);
        edtPhone = findViewById(R.id.edtPhone);
        edtAddress = findViewById(R.id.edtAddress);
        edtEmail = findViewById(R.id.edtEmail);
        Gendar = findViewById(R.id.Gendar);
        btCreate = findViewById(R.id.btCreate);
        btCancel = findViewById(R.id.btCancel);

    }
}