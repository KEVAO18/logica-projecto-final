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
    
    
    /**
     * getters
     */
    
    
    public int getTieneTecho() {
        return tieneTecho;
    }    
    
    public int getTieneCamaraRefri() {
        return tieneCamaraRefri;
    }

    public int getNumVitri() {
        return numVitri;
    }

    public float getTamaño() {
        return tamaño;
    }

    public Perfil getDueno() {
        return dueno;
    }

    public float getPrecio() {
        return precio;
    }

    public float getValorBase() {
        return valorBase;
    }

    public int getEstaDisponible() {
        return estaDisponible;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setTieneTecho(int tieneTecho) {
        this.tieneTecho = tieneTecho;
    }

    public void setTieneCamaraRefri(int tieneCamaraRefri) {
        this.tieneCamaraRefri = tieneCamaraRefri;
    }

    public void setNumVitri(int numVitri) {
        this.numVitri = numVitri;
    }

    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }

    public void setDueno(Perfil dueno) {
        this.dueno = dueno;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setValorBase(float valorBase) {
        this.valorBase = valorBase;
    }

    public void setEstaDisponible(int estaDisponible) {
        this.estaDisponible = estaDisponible;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }    
}
