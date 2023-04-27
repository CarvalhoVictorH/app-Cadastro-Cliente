package com.example.app_cadastro_cliente.model;

public class Cliente {

     private String nomeCompleto;
     private String email;
     private Number cpf;
     private Number telefone;


     public Cliente (){}

     public String getNomeCompleto() {
          return nomeCompleto;
     }

     public void setNomeCompleto(String nomeCompleto) {
          this.nomeCompleto = nomeCompleto;
     }

     public String getEmail() {
          return email;
     }

     public void setEmail(String email) {
          this.email = email;
     }

     public Number getCpf() {
          return cpf;
     }

     public void setCpf(Number cpf) {
          this.cpf = cpf;
     }

     public Number getTelefone() {
          return telefone;
     }

     public void setTelefone(Number telefone) {
          this.telefone = telefone;
     }
}

