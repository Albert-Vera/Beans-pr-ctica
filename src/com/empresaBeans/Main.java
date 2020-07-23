package com.empresaBeans;

public class Main {
    public static void main(String[] args) {
        Producte nouProducte = new Producte(1, "Prana abc.234", 10,3,16);
        Comanda novaComanda = new Comanda();

        nouProducte.addPropertyChangeListener(novaComanda);
        nouProducte.setStockActual(2);

        if (novaComanda.isDemanar()){
            System.out.println("Realitzar comanda a producte: " + nouProducte.getDescripcion());;
        }else {
            System.out.println("No es necessari realitzar comanda a producte: " + nouProducte.getDescripcion());;
        }
    }
}

