package com.empresaBeans;


import java.beans.PropertyChangeSupport;
import java.io.Serializable;

public class Producte  implements Serializable {

    public static final long serialVersionUID = 1L;
    private String descripcion;
    private int idProducte;
    private int stockActual;
    private int stockMinim;
    private float preu;
    private PropertyChangeSupport propertyChangeSupport;

    public Producte (){    }

    public Producte(int idProducte, String descripcion,  int stockActual, int stockMinim, float preu) {
        this.propertyChangeSupport = new PropertyChangeSupport(this);
        this.descripcion = descripcion;
        this.idProducte = idProducte;
        this.stockActual = stockActual;
        this.stockMinim = stockMinim;
        this.preu = preu;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdProducte() {
        return idProducte;
    }

    public void setIdProducte(int idProducte) {
        this.idProducte = idProducte;
    }

    public int getStockActual() {
        return stockActual;
    }

    public void setStockActual(int nouValor) {
        int valorAnterior = this.stockActual;
        this.stockActual = nouValor;
        if (this.stockActual < this.getStockMinim()){
            this.propertyChangeSupport.firePropertyChange("stockActual", valorAnterior, this.stockActual);
        }
    }

    public int getStockMinim() {
        return stockMinim;
    }

    public void setStockMinim(int stockMinim) {
        this.stockMinim = stockMinim;
    }

    public float getPreu() {
        return preu;
    }

    public void setPreu(float preu) {
        this.preu = preu;
    }
    public void addPropertyChangeListener( Comanda comanda){
        this.propertyChangeSupport.addPropertyChangeListener(comanda);
    }

}
