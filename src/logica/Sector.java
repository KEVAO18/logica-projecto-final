package logica;

import javax.swing.JOptionPane;

/**
 *
 * @author Melani
 */
public class Sector {
    private int numSector;
    private int numLocales;
    private float presioBase;

    /**
     * 
     */
    public Sector() {
        
    }

    /**
     * 
     * @param numSector
     * @param numLocales
     * @param presioBase 
     */
    public Sector(
            int numSector, 
            int numLocales, 
            float presioBase
    ) {
        this.numSector = numSector;
        this.numLocales = numLocales;
        this.presioBase = presioBase;
    }
    
    /**
     * 
     */
    public void registrarSector(){
        this.setNumSector(Integer.parseInt(JOptionPane.showInputDialog("Numero del sector")));
        this.setNumLocales(Integer.parseInt(JOptionPane.showInputDialog("Numero de locales que posee el sector")));
        this.setPresioBase(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el presio base que posee el sector")));
    }
    
    /**
     * 
     */
    public void actualizarSector() {
        this.setNumSector(Integer.parseInt(JOptionPane.showInputDialog("Numero del sector")));
        this.setNumLocales(Integer.parseInt(JOptionPane.showInputDialog("Numero de locales que posee el sector")));
        this.setPresioBase(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el presio base que posee el sector")));
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
     * @return presioBase
     */
    public float getPresioBase() {
        return presioBase;
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
     * @param presioBase 
     */
    public void setPresioBase(float presioBase) {
        this.presioBase = presioBase;
    }
    
}
