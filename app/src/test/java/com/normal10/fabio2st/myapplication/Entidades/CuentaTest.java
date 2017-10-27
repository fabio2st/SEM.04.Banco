package com.normal10.fabio2st.myapplication.Entidades;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Propietario on 26/10/17.
 */
public class CuentaTest {
    Cuenta cuenta1;
    boolean resultado;

    @Test
    public void testDeposito() throws Exception {
        cuenta1 = new Cuenta(666, 0);
        assertEquals(0.0, cuenta1.getBalance(), 0);
        // hacemos un deposito
        cuenta1.depositar(100);
        assertEquals(100, cuenta1.getBalance(), 0);
        cuenta1.depositar(-100);
        assertEquals(100, cuenta1.getBalance(), 0);
    }

    @Test
    public void testExtraccionExitosa() throws Exception {
        cuenta1 = new Cuenta(666, 100);
         // realizamos una extracción exitosa
        resultado = cuenta1.extraer(50);
        //if (resultado) System.out.println("extracción exitosa");
        assertTrue(resultado);
        assertEquals(50, cuenta1.getBalance(), 0);
    }

        // realizamos una extracción fallida
    @Test
     public void testExtraccionNoExitosa() throws Exception {
        cuenta1 = new Cuenta(666, 50);
        resultado = cuenta1.extraer(70);
        assertEquals(50,cuenta1.getBalance(),0);
        //if (!resultado) System.out.println("extracción no fue exitosa");
        assertFalse(resultado);
    }

    @Test
    public void testDesactivar() throws Exception{
        cuenta1 = new Cuenta(666, 50);
        cuenta1.suspender();
        cuenta1.depositar(50);
        assertEquals(50,cuenta1.getBalance(),0);
        cuenta1.extraer(30);
        assertEquals(50,cuenta1.getBalance(),0);
        cuenta1.reactivar();
        cuenta1.depositar(50);
        assertEquals(100,cuenta1.getBalance(),0);
    }

    @Test
    public void testPolimorfismo() throws Exception {
        Cuenta cc1 = new CuentaCorriente(666,0,0);
        cc1.getBalance();
        CuentaCorriente cc2 = new CuentaCorriente(666,0,0);
        cc2.getMontoSobregiro();
        CajaDeAhorro ca1 = new CajaDeAhorro(666,100);
        ca1.capitalizar();
    }
}