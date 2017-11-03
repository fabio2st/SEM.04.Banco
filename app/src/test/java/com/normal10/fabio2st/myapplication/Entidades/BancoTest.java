package com.normal10.fabio2st.myapplication.Entidades;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Propietario on 2/11/17.
 */
public class BancoTest {
    @Test
    public void containsCliente() throws Exception {
        Cliente cliente1 = new Cliente("TATA", "PEPE");
        assertFalse(Banco.containsCliente(cliente1));
        Banco.addCliente(cliente1);
        assertTrue(Banco.containsCliente(cliente1));
        Banco.removeCliente(cliente1);
        assertFalse(Banco.containsCliente(cliente1));
    }

}