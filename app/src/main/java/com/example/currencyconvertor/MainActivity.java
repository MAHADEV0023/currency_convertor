package com.example.currencyconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     public void currencycon(View view)
     {
         EditText editTextNumber=(EditText)findViewById(R.id.editTextNumber);
         Double dollerammout=Double.parseDouble(editTextNumber.getText().toString());
         Double indammount = dollerammout*74.14;
         TextView output = (TextView) findViewById(R.id.rupees);
         output.setText(indammount.toString());

     }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}