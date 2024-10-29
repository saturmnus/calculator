package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText txtNumber1, txtNumber2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNumber1 = findViewById(R.id.txtNumber1);
        txtNumber2 = findViewById(R.id.txtNumber2);
    }

    public void handlePlusButton(View view) {
        if (validateInputs()) {
            int num1 = Integer.parseInt(txtNumber1.getText().toString());
            int num2 = Integer.parseInt(txtNumber2.getText().toString());
            int result = num1 + num2;
            Toast.makeText(this, "Result: " + result, Toast.LENGTH_SHORT).show();
        }
    }

    public void handleMinusButton(View view) {
        if (validateInputs()) {
            int num1 = Integer.parseInt(txtNumber1.getText().toString());
            int num2 = Integer.parseInt(txtNumber2.getText().toString());
            int result = num1 - num2;
            Toast.makeText(this, "Result: " + result, Toast.LENGTH_SHORT).show();
        }
    }

    private boolean validateInputs() {
        if (txtNumber1.getText().toString().isEmpty()) {
            Toast.makeText(this, "Number 1 is required", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (txtNumber2.getText().toString().isEmpty()) {
            Toast.makeText(this, "Number 2 is required", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
}