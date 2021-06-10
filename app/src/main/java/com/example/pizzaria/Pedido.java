package com.example.pizzaria;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Pedido {
    private String nomeCompleto;
    private String endereco;
    private String numero;
    private String complemento;
    private String telefone;
    private String primeiroSabor;
    private String segundoSabor;
    private String terceiroSabor;
    private String quartoSabor;
    private String formaPagamento;

    public Pedido() {
    }

    public Pedido(String nomeCompleto, String endereco, String numero, String complemento, String telefone, String primeiroSabor, String segundoSabor, String terceiroSabor, String quartoSabor, String formaPagamento) {
        this.nomeCompleto = nomeCompleto;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.telefone = telefone;
        this.primeiroSabor = primeiroSabor;
        this.segundoSabor = segundoSabor;
        this.terceiroSabor = terceiroSabor;
        this.quartoSabor = quartoSabor;
        this.formaPagamento = formaPagamento;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getPrimeiroSabor() {
        return primeiroSabor;
    }

    public void setPrimeiroSabor(String primeiroSabor) {
        this.primeiroSabor = primeiroSabor;
    }

    public String getSegundoSabor() {
        return segundoSabor;
    }

    public void setSegundoSabor(String segundoSabor) {
        this.segundoSabor = segundoSabor;
    }

    public String getTerceiroSabor() {
        return terceiroSabor;
    }

    public void setTerceiroSabor(String terceiroSabor) {
        this.terceiroSabor = terceiroSabor;
    }

    public String getQuartoSabor() {
        return quartoSabor;
    }

    public void setQuartoSabor(String quartoSabor) {
        this.quartoSabor = quartoSabor;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void salvar()
    {
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference();
        reference.child("pedido").child(getNomeCompleto()).setValue(this);
    }
}
