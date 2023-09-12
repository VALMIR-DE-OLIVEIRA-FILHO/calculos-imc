package com.example.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ImcActivity2 extends AppCompatActivity {
    private EditText editTextWeight, editTextHeight;
    private Button buttonCalculate;
    private TextView textViewResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc2);

        editTextWeight = findViewById(R.id.editTextWeight);
        editTextHeight = findViewById(R.id.editTextHeight);
        buttonCalculate = findViewById(R.id.buttonCalculate);
        textViewResult = findViewById(R.id.textViewResult);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateBMI();
            }
        });
    }

    private void calculateBMI() {
        // Obtenha os valores digitados pelo usuário
        String weightStr = editTextWeight.getText().toString();
        String heightStr = editTextHeight.getText().toString();

        if (!weightStr.isEmpty() && !heightStr.isEmpty()) {
            // Converta os valores para números
            float weight = Float.parseFloat(weightStr);
            float height = Float.parseFloat(heightStr);

            // Calcule o IMC
            float bmi = weight / (height * height);

            // Exiba o resultado do IMC
            textViewResult.setText("Resultado do IMC: " + String.format("%.2f", bmi));
        } else {
            // Se algum campo estiver vazio, mostre uma mensagem de erro
            textViewResult.setText("Por favor, preencha todos os campos.");
        }
    }
}