package com.example.cl.ejercicio6java_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cl.ejercicio6java_android.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());




        binding.btnCreated.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(binding.textName.getText().toString().isEmpty() || binding.textLastName.getText().toString().isEmpty() ||
                        binding.editTextEmail.getText().toString().isEmpty()
                || binding.editTextPassword.getText().toString().isEmpty()   ){
                    Toast.makeText(getBaseContext(), "faltan campos por completar ", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(!binding.editTextEmail.getText().toString().contains("@")){
                    Toast.makeText(getBaseContext(), "campo correo invalido ", Toast.LENGTH_SHORT).show();
                    return;
                }

                String name = binding.textName.getText().toString();
                String lastName = binding.textLastName.getText().toString();
                String email = binding.editTextEmail.getText().toString();
                String password = binding.editTextPassword.getText().toString();
                String mensaje = "Nombre: " + name + " Apellido: "+ lastName + " Email: " + email + " Password" + password;
                Toast.makeText(getBaseContext(), mensaje, Toast.LENGTH_SHORT).show();
            }
        });

    }
}