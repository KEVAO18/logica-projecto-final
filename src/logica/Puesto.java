/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author ADMIN
 */
public class Puesto {
    private int tieneTecho;
    private int tieneCamaraRefri;
    private int numVitri;
    private float tamaño;
    private Perfil dueno;
    private float precio;
    private float valorBase;
    private int estaDisponible;
    private Contrato contrato;
    
    /*
     * getters
     */
    
    
    /**
     * 
     * 
     * @return tiene techo
     */
    public int getTieneTecho() {
        return tieneTecho;
    }    
    
    /**
     * 
     * @return tieneCamaraRefri
     */
    public int getTieneCamaraRefri() {
        return tieneCamaraRefri;
    }

    /**
     * 
     * @return numVitri
     */
    public int getNumVitri() {
        return numVitri;
    }

    /**
     * 
     * @return tamaño
     */
    public float getTamaño() {
        return tamaño;
    }

    /**
     * 
     * @return dueno
     */
    public Perfil getDueno() {
        return dueno;
    }

    /**
     * 
     * @return precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * 
     * @return valorBase
     */
    public float getValorBase() {
        return valorBase;
    }

    /**
     * 
     * @return estaDisponible
     */
    public int getEstaDisponible() {
        return estaDisponible;
    }

    /**
     * 
     * @return contrato
     */
    public Contrato getContrato() {
        return contrato;
    }
    
    /*
     * setters
     */
    
    /**
     * 
     * @param tieneTecho 
     */
    public void setTieneTecho(int tieneTecho) {
        this.tieneTecho = tieneTecho;
    }

    /**
     * 
     * @param tieneCamaraRefri 
     */
    public void setTieneCamaraRefri(int tieneCamaraRefri) {
        this.tieneCamaraRefri = tieneCamaraRefri;
    }
    
    /**
     * 
     * @param numVitri 
     */
    public void setNumVitri(int numVitri) {
        this.numVitri = numVitri;
    }
    
    /**
     * 
     * @param tamaño 
     */
    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }

    /**
     * 
     * @param dueno 
     */
    public void setDueno(Perfil dueno) {
        this.dueno = dueno;
    }

    /**
     * 
     * @param precio 
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * 
     * @param valorBase 
     */
    public void setValorBase(float valorBase) {
        this.valorBase = valorBase;
    }

    /**
     * 
     * @param estaDisponible 
     */
    public void setEstaDisponible(int estaDisponible) {
        this.estaDisponible = estaDisponible;
    }

    /**
     * 
     * @param contrato 
     */
    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }
    
    
}
