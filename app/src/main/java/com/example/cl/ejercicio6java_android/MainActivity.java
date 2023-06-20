package com.example.cl.ejercicio6java_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText textName = findViewById(R.id.textName);
        EditText textLastName = findViewById(R.id.textLastName);
        EditText textEmail = findViewById(R.id.editTextEmail);
        EditText textPassword = findViewById(R.id.editTextPassword);

        Button btnCreated = findViewById(R.id.btnCreated);

        btnCreated.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textName.getText().toString().isEmpty() || textLastName.getText().toString().isEmpty() || textEmail.getText().toString().isEmpty()
                || textPassword.getText().toString().isEmpty()   ){
                    Toast.makeText(getBaseContext(), "faltan campos por completar ", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(!textEmail.getText().toString().contains("@")){
                    Toast.makeText(getBaseContext(), "campo correo invalido ", Toast.LENGTH_SHORT).show();
                    return;
                }

                String name = textName.getText().toString();
                String lastName = textLastName.getText().toString();
                String email = textEmail.getText().toString();
                String password = textPassword.getText().toString();
                String mensaje = "Nombre: " + name + " Apellido: "+ lastName + " Email: " + email + " Password" + password;
                Toast.makeText(getBaseContext(), mensaje, Toast.LENGTH_SHORT).show();
            }
        });

    }
}