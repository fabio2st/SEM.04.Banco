package com.normal10.fabio2st.myapplication.Entidades;

import java.util.ArrayList;

/**
 * Created by Propietario on 24/10/17.
 */

public class Cliente {
    private String nombre;
    private String apellido;
    private ArrayList<Cuenta> cuentas;

    public Cliente() throws Exception{
        this("", "");
    }

    public Cliente(String apellido, String nombre) throws Exception{
        cuentas = new ArrayList<Cuenta>();
        setApellido(apellido);
        setNombre(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception{
        if (nombre == "")
            throw new Exception("Nombre no puede estar vacio");
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void addCuenta(Cuenta cuenta){
        cuenta.setCliente(this);
        cuentas.add(cuenta);
    }

    public void removeCuenta(Cuenta cuenta){
        cuenta.setCliente(null);
        cuentas.remove(cuenta);
    }

    public ArrayList<Cuenta> getAllCuentas(){
        return cuentas;
    }
    // los metodos en java son por defecto virtuales
    @Override
    public String toString(){
        return getApellido() +", " + getNombre();
    }
}
