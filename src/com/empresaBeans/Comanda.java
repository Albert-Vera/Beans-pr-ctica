package com.empresaBeans;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.Serializable;
import java.util.Date;

public class Comanda implements Serializable, PropertyChangeListener {
    public static final long serialVersionUID = 2L;
    private int numeroComanda;
    private int idProducte;
    private Date data;
    private int numero;
    private boolean demanar;

    public Comanda() {
    }

    public Comanda(int numeroComanda, int idProducte, Date data, int numero, boolean demanar) {
        this.numeroComanda = numeroComanda;
        this.idProducte = idProducte;
        this.data = data;
        this.numero = numero;
        this.demanar = demanar;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("Stock anterior: " + evt.getOldValue());
        System.out.println("Stock actual: " + evt.getNewValue());
        this.setDemanar(true);
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getNumeroComanda() {
        return numeroComanda;
    }

    public void setNumeroComanda(int numeroComanda) {
        this.numeroComanda = numeroComanda;
    }

    public int getIdProducte() {
        return idProducte;
    }

    public void setIdProducte(int idProducte) {
        this.idProducte = idProducte;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isDemanar() {
        return demanar;
    }

    public void setDemanar(boolean demanar) {
        this.demanar = demanar;
    }
}
