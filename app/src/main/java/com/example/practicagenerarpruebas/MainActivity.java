package com.example.practicagenerarpruebas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * Declaramos las variables que vamos a usar
     */
    Button boton,boton2,boton3,boton4,boton5;
    EditText editText;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /**
         * Asignamos cada componente a las variables creadas anteriormente
         */
        setContentView(R.layout.activity_main);
        boton=findViewById(R.id.button);
        boton2=findViewById(R.id.button2);
        boton3=findViewById(R.id.button3);
        boton4=findViewById(R.id.button4);
        boton5=findViewById(R.id.button5);
        editText=findViewById(R.id.editTextNumero);
        textView=findViewById(R.id.resultado);

        /**
         * Escuchador para cuando pulsamos el botón donde llamamos a la función que pasa de Millas a Kilómetros y nos muestra el resultado en el textview
         */
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(Operaciones.MaK(editText.getText().toString()));
            }
        });
        /**
         * Escuchador para cuando pulsamos el botón2 donde llamamos a la función que pasa de Kilómetros a Millas y nos muestra el resultado en el textview
         */
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(Operaciones.KaM(editText.getText().toString()));
            }
        });
        /**
         * Escuchador para cuando pulsamos el botón3 donde llamamos a la función que pasa de Celsius a Fahrenheit y nos muestra el resultado en el textview
         */
        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(Operaciones.CaF(editText.getText().toString()));
            }
        });
        /**
         * Escuchador para cuando pulsamos el botón4 donde llamamos a la función que pasa de Fahrenheit a Celsius y nos muestra el resultado en el textview
         */
        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(Operaciones.FaC(editText.getText().toString()));
            }
        });
        /**
         * Escuchador para cuando pulsamos el botón5 donde llamamos a la función que pasa de Kb a Mb y nos muestra el resultado en el textview
         */
        boton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(Operaciones.pasarKBaMB(editText.getText().toString()));
            }
        });
    }
}