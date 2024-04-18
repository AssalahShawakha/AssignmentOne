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

public class Mul extends AppCompatActivity {

    private EditText Ma1,Ma2,Mb1,Mb2,Mc1,Mc2,Md1,Md2,MS1,MS2,MS3,MS4;
    private Button btMBack, btMultiplication;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mul);
        setupViews();
        Back();
        Multiplication();
    }

    private void Multiplication() {
        btMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Mul1 = (Double.parseDouble(Ma1.getText().toString()) * Double.parseDouble(Ma2.getText().toString())) +
                        (Double.parseDouble(Mb1.getText().toString()) * Double.parseDouble(Mc2.getText().toString()));
                MS1.setText(Mul1 + " ");

                double Mul2 = (Double.parseDouble(Ma1.getText().toString()) * Double.parseDouble(Mb2.getText().toString())) +
                        (Double.parseDouble(Mb1.getText().toString()) * Double.parseDouble(Md2.getText().toString()));
                MS2.setText(Mul2 + " ");

                double Mul3 = (Double.parseDouble(Mc1.getText().toString()) * Double.parseDouble(Ma2.getText().toString())) +
                        (Double.parseDouble(Md1.getText().toString()) * Double.parseDouble(Mc2.getText().toString()));

                MS3.setText(Mul3 + " ");

                double Mul4 = (Double.parseDouble(Mc1.getText().toString()) * Double.parseDouble(Mb2.getText().toString())) +
                        (Double.parseDouble(Md1.getText().toString()) * Double.parseDouble(Md2.getText().toString()));

                MS4.setText(Mul4 + " ");

            }
        });
    }

    private void Back() {
        btMBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mul.this,Welcome.class);
                startActivity(intent);
            }
        });
    }


    private void setupViews() {
        btMBack = findViewById(R.id.btMBack);
        btMultiplication = findViewById(R.id.btMultiplication);

        Ma1 = findViewById(R.id.Ma1);
        Ma2 = findViewById(R.id.Ma2);
        Mb1 = findViewById(R.id.Mb1);
        Mb2 = findViewById(R.id.Mb2);
        Mc1 = findViewById(R.id.Mc1);
        Mc2 = findViewById(R.id.Mc2);
        Md1 = findViewById(R.id.Md1);
        Md2 = findViewById(R.id.Md2);
        MS1 = findViewById(R.id.MS1);
        MS2 = findViewById(R.id.MS2);
        MS3 = findViewById(R.id.MS3);
        MS4 = findViewById(R.id.MS4);
    }
}