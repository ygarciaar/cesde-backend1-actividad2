package com.example;

public class CuentaBancaria {

    // Atributos privados
    private String titular;
    private double saldo;

    // Constructor
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = (saldoInicial < 0) ? 0 : saldoInicial;
    }

    // Getter y Setter de titular
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    // Solo Getter para saldo
    public double getSaldo() {
        return saldo;
    }

    // Método depositar
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        } else {
            System.out.println("Error: la cantidad a depositar debe ser mayor a 0.");
        }
    }

    // Método retirar
    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: la cantidad a retirar debe ser mayor a 0.");
        } else if (cantidad > saldo) {
            System.out.println("Error: fondos insuficientes.");
        } else {
            saldo -= cantidad;
        }
    }
}