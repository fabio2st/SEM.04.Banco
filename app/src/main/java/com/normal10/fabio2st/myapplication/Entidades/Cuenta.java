package com.normal10.fabio2st.myapplication.Entidades;

/**
 * Created by Propietario on 24/10/17.
 */

public class Cuenta implements Suspendible {
    private int numero;
    private double balance;
    protected boolean activa;

    public Cuenta(){
        this(0,0);
    }

    public Cuenta(int numero, double balance){
        setNumero(numero);
        setBalance(balance);
        activa = true;
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
        if (activa)
            if (valor>0)
                setBalance(getBalance() + valor);
    }

    public boolean extraer(double valor){
        if (activa) {
            if (getBalance() >= valor) {
                setBalance(getBalance() - valor);
                return true;
            }
        }
        return false;
    }

    @Override
    public void suspender() {
        activa = false;
    }

    @Override
    public void reactivar() {
        activa = true;
    }
}
