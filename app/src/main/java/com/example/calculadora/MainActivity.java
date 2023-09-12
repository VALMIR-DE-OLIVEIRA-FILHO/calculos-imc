package com.example.calculadora;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    EditText editTextValue1, editTextValue2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextValue1 = findViewById(R.id.editTextValue1);
        editTextValue2 = findViewById(R.id.editTextValue2);
    }

    public void onSumButtonClick(View view) {
        String value1 = editTextValue1.getText().toString();
        String value2 = editTextValue2.getText().toString();

        // Converte os valores de String para int
        int intValue1 = Integer.parseInt(value1);
        int intValue2 = Integer.parseInt(value2);

        // Calcula a soma
        int result = intValue1 + intValue2;

        // Inicia a ResultActivity e passa o resultado como extra
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("RESULT", result);
        startActivity(intent);
    }
}