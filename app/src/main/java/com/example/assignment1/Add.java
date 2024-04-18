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

public class Add extends AppCompatActivity {
    private EditText Aa1,Aa2,Ab1,Ab2,Ac1,Ac2,Ad1,Ad2,AS1,AS2,AS3,AS4;
    private Button btABack, btAddition;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add);
        setupViews();
        Back();
        Addition();
    }

    private void Back() {
        btABack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Add.this,Welcome.class);
                startActivity(intent);
            }
        });
    }

    private void Addition() {
        btAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double Sum1 = Double.parseDouble(Aa1.getText().toString()) + Double.parseDouble(Aa2.getText().toString());
                AS1.setText(Sum1 + " ");

                Double Sum2 = Double.parseDouble(Ab1.getText().toString()) + Double.parseDouble(Ab2.getText().toString());
                AS2.setText(Sum2 + " ");

                Double Sum3 = Double.parseDouble(Ac1.getText().toString()) + Double.parseDouble(Ac2.getText().toString());
                AS3.setText(Sum3 + " ");

                Double Sum4 = Double.parseDouble(Ad1.getText().toString()) + Double.parseDouble(Ad2.getText().toString());
                AS4.setText(Sum4 + " ");
            }
        });
    }

    private void setupViews() {
        btABack = findViewById(R.id.btABack);
        btAddition = findViewById(R.id.btAddition);

        Aa1 = findViewById(R.id.Aa1);
        Aa2 = findViewById(R.id.Aa2);
        Ab1 = findViewById(R.id.Ab1);
        Ab2 = findViewById(R.id.Ab2);
        Ac1 = findViewById(R.id.Ac1);
        Ac2 = findViewById(R.id.Ac2);
        Ad1 = findViewById(R.id.Ad1);
        Ad2 = findViewById(R.id.Ad2);
        AS1 = findViewById(R.id.AS1);
        AS2 = findViewById(R.id.AS2);
        AS3 = findViewById(R.id.AS3);
        AS4 = findViewById(R.id.AS4);
    }
}