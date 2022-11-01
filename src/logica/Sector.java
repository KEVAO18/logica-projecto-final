package logica;

import javax.swing.JOptionPane;

/**
 *
 * @author Melany
 */
public class Sector {
    private int numSector;
    private int numLocales;
    private float precioBase;

    /**
     * 
     */
    public Sector() {
        
    }

    /**
     * 
     * @param numSector
     * @param numLocales
     * @param precioBase 
     */
    public Sector(
            int numSector, 
            int numLocales, 
            float precioBase
    ) {
        this.numSector = numSector;
        this.numLocales = numLocales;
        this.precioBase = precioBase;
    }
    
    /**
     * 
     */
    public void registrarSector(){
        this.setNumSector(Integer.parseInt(JOptionPane.showInputDialog("Numero del sector")));
        this.setNumLocales(Integer.parseInt(JOptionPane.showInputDialog("Numero de locales que posee el sector")));
        this.setPrecioBase(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el presio base que posee el sector")));
    }
    
    /**
     * 
     */
    public void actualizarSector() {
        this.setNumSector(Integer.parseInt(JOptionPane.showInputDialog("Numero del sector")));
        this.setNumLocales(Integer.parseInt(JOptionPane.showInputDialog("Numero de locales que posee el sector")));
        this.setPrecioBase(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el presio base que posee el sector")));
    }
    
    /**
     * 
     * @return numLocales
     */
    public int getNumLocales() {
        return numLocales;
    }
    
    /**
     * 
     * @return numSector
     */
    public int getNumSector() {
        return numSector;
    }

    /**
     * 
     * @return precioBase
     */
    public float getPrecioBase() {
        return precioBase;
    }

    /**
     * 
     * @param numLocales 
     */
    public void setNumLocales(int numLocales) {
        this.numLocales = numLocales;
    }

    /**
     * 
     * @param numSector 
     */
    public void setNumSector(int numSector) {
        this.numSector = numSector;
    }

    /**
     * 
     * @param precioBase 
     */
    public void setPrecioBase(float precioBase) {
        this.precioBase = precioBase;
    }
    
}
