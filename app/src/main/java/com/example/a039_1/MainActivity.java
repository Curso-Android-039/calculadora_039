package com.example.a039_1;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InsertGesture;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

   // recibir  los elementos del layout

        EditText txt1 = findViewById(R.id.num1);
        EditText txt2 = findViewById(R.id.num2);
        TextView txt3 = findViewById(R.id.resul);


        Button btn = findViewById(R.id.sumar);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String num1  = txt1.getText().toString();
                String num2  = txt2.getText().toString();

                try {
                   if( txt1.getText().toString().isEmpty() || txt2.getText().toString().isEmpty())
                   {

                       Toast mensaje = Toast.makeText(getApplicationContext(),"INGRESE TODOS LOS VALORES" ,Toast.LENGTH_LONG);
                       mensaje.show();
                   }

                   int resul = Integer.parseInt(num1)+ Integer.parseInt(num2);
                   txt3.setText("El resultado es :" + resul);

                   txt1.setText("");
                    txt2.setText("");

                }catch (Exception e) {
                    Log.d (" ver","algo salio mal");

                }

            }
        });








    }
}