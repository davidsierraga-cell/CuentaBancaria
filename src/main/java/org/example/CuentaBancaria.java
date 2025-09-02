package org.example;

public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(){
        this.saldo = 0.0;
    }

    public void depositar(double cantidad){
        if(cantidad > 0){
            saldo += cantidad;
            System.out.println("Depósito exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("La cantidad a depositar debe ser positiva.");
        }

    }

    public void retirar(double cantidad){
        if(cantidad > 0 && cantidad <= saldo){
            saldo -= cantidad;
            System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Cantidad inválida o fondos insuficientes.");
        }
    }

    public double getSaldo(){
        return saldo;
    }

}
