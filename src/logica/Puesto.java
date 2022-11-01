package logica;

import javax.swing.JOptionPane;

/**
 *
 * @author Samuel
 */
public class Puesto {
    private int tieneTecho;
    private int tieneCamaraRefri;
    private int numVitri;
    private float tamano;
    private Perfil dueno;
    private float precio;
    private float valorBase;
    private int estaDisponible;
    private Contrato contrato;

    public Puesto() {
        
    }
    
    public Puesto(
            int tieneTecho, 
            int tieneCamaraRefri, 
            int numVitri, 
            float tamano, 
            Perfil dueno, 
            float precio, 
            float valorBase, 
            int estaDisponible, 
            Contrato contrato
    ) {
        this.tieneTecho = tieneTecho;
        this.tieneCamaraRefri = tieneCamaraRefri;
        this.numVitri = numVitri;
        this.tamano = tamano;
        this.dueno = dueno;
        this.precio = precio;
        this.valorBase = valorBase;
        this.estaDisponible = estaDisponible;
        this.contrato = contrato;
    }
    
    /*
     * getters
     */
    
    /**
     * 
     * 
     * @return tieneTecho
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
    public float getTamano() {
        return tamano;
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
     * @param tamano 
     */
    public void setTamano(float tamano) {
        this.tamano = tamano;
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
    
    public void registrarPuesto(){
        
        Perfil p = new Perfil();
    
        /*
            private int tieneTecho;
            private int tieneCamaraRefri;
            private int numVitri;
            private float tamano;
            private Perfil dueno;
            private float precio;
            private float valorBase;
            private int estaDisponible;
            private Contrato contrato;
         */
        
        this.setTieneTecho(JOptionPane.showConfirmDialog(null, "Tiene techo", "Techo", 0));
        
        this.setTieneCamaraRefri(JOptionPane.showConfirmDialog(null, "Tiene camara refrigerante", "Camara Refrigerante", 0));
        
        this.setNumVitri(Integer.parseInt(JOptionPane.showInputDialog(null, "Numero de vitrinas", 0)));
        
        this.setTamano(Float.parseFloat(JOptionPane.showInputDialog(null ,"Tamaño del local", 0)));
        
        
        
    }

    public void actualizarPuesto(){
        
        /*
            private int id;
            private int tieneTecho;
            private int tieneCamaraRefri;
            private int numVitri;
            private float tamano;
            private Perfil dueno;
            private float precio;
            private float valorBase;
            private int estaDisponible;
            private Contrato contrato;
        */
    
        this.setTieneTecho(JOptionPane.showConfirmDialog(null, "Tiene techo", "Techo", 0));
        
        this.setTieneCamaraRefri(JOptionPane.showConfirmDialog(null, "Tiene camara refrigerante", "Camara Refrigerante", 0));
        
        this.setNumVitri(Integer.parseInt(JOptionPane.showInputDialog("Numero de vitrinas")));
        
        this.setTamano(Float.parseFloat(JOptionPane.showInputDialog("Tamaño del local")));
        
    }

    
    
}
