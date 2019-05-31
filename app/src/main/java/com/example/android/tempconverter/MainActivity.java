package com.example.android.tempconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText FahrenheitIn;
    TextView CelsiusOut;
    Button Convert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Convert = findViewById(R.id.convert);
        FahrenheitIn = findViewById(R.id.fahrenheit_input);
        CelsiusOut = findViewById(R.id.celsius_display);
    }


}
