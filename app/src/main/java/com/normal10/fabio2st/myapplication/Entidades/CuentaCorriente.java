package com.normal10.fabio2st.myapplication.Entidades;

/**
 * Created by Propietario on 26/10/17.
 */

public class CuentaCorriente extends Cuenta {
    private double montoSobregiro;

    public CuentaCorriente(int numero, double balance, double montoSobregiro) {
        super(numero, balance);
        setMontoSobregiro(montoSobregiro);
    }

    public double getMontoSobregiro() {
        return montoSobregiro;
    }

    public void setMontoSobregiro(double montoSobregiro) {
        this.montoSobregiro = montoSobregiro;
    }

    public boolean extraer(double valor){
        if (activa) {
            if (getBalance() + getMontoSobregiro() >= valor) {
                setBalance(getBalance() - valor);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString(){
        return "CC" + getNumero();
    }
}

