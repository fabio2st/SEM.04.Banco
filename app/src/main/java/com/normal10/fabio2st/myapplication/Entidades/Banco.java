package com.normal10.fabio2st.myapplication.Entidades;

import java.util.ArrayList;

/**
 * Created by Propietario on 2/11/17.
 */

public class Banco {
    private static ArrayList<Cliente> clientes;

    static {
        clientes = new ArrayList<Cliente>();
    }

    public static void addCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public static void removeCliente(Cliente cliente){
        clientes.remove(cliente);
    }

    public static ArrayList<Cliente> getAllClientes(){
        return clientes;
    }

    public static boolean containsCliente(Cliente cliente){
        return clientes.contains(cliente);
    }
}
