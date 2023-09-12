package com.example.calculadora;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class ResultActivity extends AppCompatActivity {
    TextView textViewResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result2);

        textViewResult = findViewById(R.id.textViewResult);

        // Recebe o resultado da MainActivity
        Intent intent = getIntent();
        int result = intent.getIntExtra("RESULT", 0); // 0 é o valor padrão se não houver nenhum resultado extra

        // Exibe o resultado
        textViewResult.setText("Resultado: " + result);
    }
}
