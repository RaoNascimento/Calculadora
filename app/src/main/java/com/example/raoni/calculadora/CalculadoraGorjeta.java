package com.example.raoni.calculadora;



/**
 * Created by DB on 04/04/2017.
 */

public class CalculadoraGorjeta {

    private float valorConta;

    public float getValorConta() {
        return valorConta;
    }

    public void setValorConta(float valorConta) {
        this.valorConta = valorConta;
    }

    public float getGorjeta(float porcentagem) {
        return valorConta * porcentagem;
    }
}

