package com.example.assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Rools extends AppCompatActivity {

    private Button btRBack;
    private ListView lstRools;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_rools);
        lstRools = findViewById(R.id.lstRools);
        btRBack = findViewById(R.id.btRBack);
        String[] data = {"[A] * ([B] + [C]) = [A] * [B] + [A] * [C] 'First Law of Distribution'",
                "( [A] + [B] ) * [C] = [A] * [C] + [B] * [C] 'Second Law of Distribution'",
                "( [A] * [B] ) * [C] = [A] * ( [B] * [C] ) 'Border Demarcation Law'",
                "[A] * [B] 'not equal' [B] * [A]",
                "[A] * [B] = 0 'Not necessarily' [A] = 0 OR [B] = 0",
                "[A] * [C] = [A] * [B] 'Not necessarily' [B] = [C]",
                "[A] + [0] = [A] 'Neutral element for Addition'",
                "[A] * [1] = [A] 'Neutral element for Multiplication'"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Rools.this, android.R.layout.simple_list_item_1, data);
        lstRools.setAdapter(adapter);
        Back();

    }

    private void Back() {
        btRBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Rools.this,Welcome.class);
                startActivity(intent);
            }
        });
    }
}