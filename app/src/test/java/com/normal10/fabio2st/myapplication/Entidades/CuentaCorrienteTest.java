package com.normal10.fabio2st.myapplication.Entidades;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Propietario on 26/10/17.
 */
public class CuentaCorrienteTest {
    CuentaCorriente cc1;
    boolean resultado;

    @Test
    public void testMontoSobregiro() throws Exception {
        cc1 = new CuentaCorriente(666, 0, 100);
        resultado = cc1.extraer(50);
        assertTrue(resultado);
        assertEquals(-50, cc1.getBalance(), 0);

        resultado = cc1.extraer(150);
        assertFalse(resultado);
        assertEquals(-50, cc1.getBalance(), 0);
    }
}