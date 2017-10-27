package com.normal10.fabio2st.myapplication.Entidades;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Propietario on 26/10/17.
 */
public class CajaDeAhorroTest {
    CajaDeAhorro ca1;

    @Test
    public void capitalizar() throws Exception {
        CajaDeAhorro.setInteresMensual(2);
        assertEquals(2,CajaDeAhorro.getInteresMensual(),0);
        ca1 = new CajaDeAhorro(666,1000);
        ca1.capitalizar();
        assertEquals(1020,ca1.getBalance(),0);
    }

}