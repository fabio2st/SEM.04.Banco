package com.normal10.fabio2st.myapplication.Entidades;

/**
 * Created by Propietario on 26/10/17.
 */

public class CajaDeAhorro extends Cuenta {
    private static float interesMensual;

    public CajaDeAhorro(int numero, double balance) {
        super(numero, balance);
        //setInteresMensual(interesMensual);
    }

    public static float getInteresMensual() {
        return interesMensual;
    }

    public static void setInteresMensual(float interesMensual) {
        CajaDeAhorro.interesMensual = interesMensual;
    }

    public void capitalizar(){
        setBalance(getBalance()+getBalance()*interesMensual/100);
    }
}
