package com.normal10.fabio2st.myapplication.Entidades;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Propietario on 24/10/17.
 */
public class ClienteTest {
    @Test
    public void TestCliente() throws Exception {
        Cliente cliente;
        cliente = new Cliente();
        assertEquals("",cliente.getNombre());
        assertEquals("",cliente.getApellido());
        String apellido = "Lepaurd";
        String nombre = "Pepe";
        cliente = new Cliente(apellido,nombre);
        assertEquals(nombre,cliente.getNombre());
        assertEquals(apellido,cliente.getApellido());
        System.out.println(cliente.getApellido());
    }

}