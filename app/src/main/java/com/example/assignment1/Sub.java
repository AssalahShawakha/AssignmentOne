package com.example.assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Sub extends AppCompatActivity {
    private EditText Sa1,Sa2,Sb1,Sb2,Sc1,Sc2,Sd1,Sd2,SS1,SS2,SS3,SS4;
    private Button btSBack, btSubtraction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sub);
        setupViews();
        Back();
        Subtraction();
    }

    private void Subtraction() {
        btSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double Sub1 = Double.parseDouble(Sa1.getText().toString()) - Double.parseDouble(Sa2.getText().toString());
                SS1.setText(Sub1 + " ");

                Double Sub2 = Double.parseDouble(Sb1.getText().toString()) - Double.parseDouble(Sb2.getText().toString());
                SS2.setText(Sub2 + " ");

                Double Sub3 = Double.parseDouble(Sc1.getText().toString()) - Double.parseDouble(Sc2.getText().toString());
                SS3.setText(Sub3 + " ");

                Double Sub4 = Double.parseDouble(Sd1.getText().toString()) - Double.parseDouble(Sd2.getText().toString());
                SS4.setText(Sub4 + " ");
            }
        });
    }

    private void Back() {
        btSBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sub.this,Welcome.class);
                startActivity(intent);
            }
        });
    }

    private void setupViews() {
        btSBack = findViewById(R.id.btSBack);
        btSubtraction = findViewById(R.id.btSubtraction);

        Sa1 = findViewById(R.id.Sa1);
        Sa2 = findViewById(R.id.Sa2);
        Sb1 = findViewById(R.id.Sb1);
        Sb2 = findViewById(R.id.Sb2);
        Sc1 = findViewById(R.id.Sc1);
        Sc2 = findViewById(R.id.Sc2);
        Sd1 = findViewById(R.id.Sd1);
        Sd2 = findViewById(R.id.Sd2);
        SS1 = findViewById(R.id.SS1);
        SS2 = findViewById(R.id.SS2);
        SS3 = findViewById(R.id.SS3);
        SS4 = findViewById(R.id.SS4);
    }
}