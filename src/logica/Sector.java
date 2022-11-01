package logica;

/**
 *
 * @author Melani
 */
public class Sector {
    private int numSector;
    private int numLocales;
    private float presioBase;

    public Sector() {
        
    }

    public Sector(
            int numSector, 
            int numLocales, 
            float presioBase
    ) {
        this.numSector = numSector;
        this.numLocales = numLocales;
        this.presioBase = presioBase;
    }
    
    public int getNumLocales() {
        return numLocales;
    }

    public int getNumSector() {
        return numSector;
    }

    public float getPresioBase() {
        return presioBase;
    }

    public void setNumLocales(int numLocales) {
        this.numLocales = numLocales;
    }

    public void setNumSector(int numSector) {
        this.numSector = numSector;
    }

    public void setPresioBase(float presioBase) {
        this.presioBase = presioBase;
    }
    
}
