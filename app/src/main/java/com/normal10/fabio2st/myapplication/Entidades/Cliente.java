package com.normal10.fabio2st.myapplication.Entidades;

/**
 * Created by Propietario on 24/10/17.
 */

public class Cliente {
    private String nombre;
    private String apellido;

    public Cliente(){
        this("", "");
    }

    public Cliente(String apellido, String nombre){
        setApellido(apellido);
        setNombre(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // los metodos en java son por defecto virtuales
    @Override
    public String toString(){
        return getApellido() +", " + getNombre();
    }
}
