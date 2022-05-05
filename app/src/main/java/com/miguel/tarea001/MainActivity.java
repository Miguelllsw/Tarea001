package com.miguel.tarea001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView  tvResultado;
    private EditText etNumero1, etNumero2;
    private Button btSuma, btMultiplicar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResultado = findViewById(R.id.tvResultado);
        etNumero1 = findViewById(R.id.etNumero1);
        etNumero2 = findViewById(R.id.etNumero2);
    }
    public void suma(View view){
        try{
            int valor1 = Integer.parseInt(etNumero1.getText().toString());
            int valor2 = Integer.parseInt(etNumero2.getText().toString());

            tvResultado.setText(String.valueOf("Resultado: "+(valor1 + valor2)));

        }catch (NumberFormatException exception){
            tvResultado.setText("Error");
        }



    }
    public void multiplicacion(View view){
        try{
            int valor1 = Integer.parseInt(etNumero1.getText().toString());
            int valor2 = Integer.parseInt(etNumero2.getText().toString());
            tvResultado.setText(String.valueOf("Resultado: "+valor1 * valor2));

        }catch (NumberFormatException exception){
            tvResultado.setText("Error");
        }


    }

}