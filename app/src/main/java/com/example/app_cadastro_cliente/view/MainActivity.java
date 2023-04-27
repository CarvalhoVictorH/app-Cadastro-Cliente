package com.example.app_cadastro_cliente.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.app_cadastro_cliente.R;
import com.example.app_cadastro_cliente.model.Cliente;


public class MainActivity extends AppCompatActivity {

    Cliente cliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cliente = new Cliente();
        cliente.setNomeCompleto("");
        cliente.setEmail("");
        cliente.setCpf(0);
        cliente.setTelefone(0);


    }

}