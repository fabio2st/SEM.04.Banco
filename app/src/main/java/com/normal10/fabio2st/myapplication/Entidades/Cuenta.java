package com.normal10.fabio2st.myapplication.Entidades;

/**
 * Created by Propietario on 24/10/17.
 */

public abstract class Cuenta implements Suspendible {
    private int numero;
    private double balance;

    public Cuenta(){
        this(0,0);
    }

    public Cuenta(int numero, double balance){
        setNumero(numero);
        setBalance(balance);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public void depositar(double valor){
        setBalance(getBalance() + valor);
    }

    public boolean extraer(double valor){
        setBalance(getBalance()-valor);
        return true;
    }
}
