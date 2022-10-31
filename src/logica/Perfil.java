package logica;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class Perfil {

    private String nombre;
    private String cc;
    private String telefono;
    private String direccion;
    private int genero;
    private int estadoCivil;
    private int tipoUsuario;
    private String nombreUsuario;
    private String contrasena;
    
    public Perfil() {

    }
    
    /**
     * 
     * @param nombre
     * @param cc
     * @param telefono
     * @param direccion
     * @param genero
     * @param estadoCivil
     * @param tipoUsuario
     * @param nombreUsuario
     * @param contrasena 
     */
    public Perfil(
            String nombre, 
            String cc, 
            String telefono, 
            String direccion, 
            int genero, 
            int estadoCivil, 
            int tipoUsuario, 
            String nombreUsuario, 
            String contrasena
    ) {
        this.nombre = nombre;
        this.cc = cc;
        this.telefono = telefono;
        this.direccion = direccion;
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.tipoUsuario = tipoUsuario;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }
    
    /**
     * 
     * Registra la informacion de un nuevo usuario
     * 
     */
    public void registrarPerfil(){
        String[] gen = {"Femenino", "Masculino", "No binario", "Otros"};
        String[] estCivil = {"Casado(a)", "Soltero(a)", "Divorciado(a)", "Union Libre", "Viudo(a)", "Otros"};
        String[] tipoUsu = {"Administrador", "Dueño", "Cliente"};
        
        JComboBox g = new JComboBox(gen);
        g.setSelectedIndex(0);
        JComboBox e = new JComboBox(estCivil);
        e.setSelectedIndex(0);
        JComboBox t = new JComboBox(tipoUsu);
        t.setSelectedIndex(0);
        
        this.setNombre(JOptionPane.showInputDialog(null, "Nombre: "));
        
        this.setCc(JOptionPane.showInputDialog(null, "Documento de identidad"));
        
        this.setTelefono(JOptionPane.showInputDialog(null, "Telefono"));
        
        this.setDireccion(JOptionPane.showInputDialog(null, "Direccion"));
        
        JOptionPane.showMessageDialog(null, g, "Genero", 0);
        this.setGenero(g.getSelectedIndex());
        System.out.println(this.getGenero());
        
        JOptionPane.showMessageDialog(null, e, "Estado Civil", 0);
        this.setEstadoCivil(e.getSelectedIndex());
        System.out.println(this.getEstadoCivil());
        
        JOptionPane.showMessageDialog(null, t, "Tipo de Usuario", 0);
        this.setTipoUsuario(t.getSelectedIndex());
        System.out.println(this.getTipoUsuario());
        
        this.setNombreUsuario(JOptionPane.showInputDialog(null, null, "Nombre de usuario"));
        
        this.setContrasena(JOptionPane.showInputDialog(null, null, "Contraseña"));
    }

    /**
     * 
     * Actualiza la informacion de un usuario registrado
     * 
     * @param id identidicador de la opcion que se va a actualizar
     * 
     */
    public void actualizarPerfil(int id){
        String[] gen = {"Femenino", "Masculino", "No binario", "Otros"};
        String[] estCivil = {"Casado(a)", "Soltero(a)", "Divorciado(a)", "Union Libre", "Viudo(a)", "Otros"};
        String[] tipoUsu = {"Administrador", "Dueño", "Cliente"};
        
        JComboBox g = new JComboBox(gen);
        g.setSelectedIndex(0);
        JComboBox e = new JComboBox(estCivil);
        e.setSelectedIndex(0);
        JComboBox t = new JComboBox(tipoUsu);
        t.setSelectedIndex(0);
        
        switch (id) {
            case 1:
                this.setNombre(JOptionPane.showInputDialog(null, "Nombre: "));
                break;
            
            case 2:
                this.setCc(JOptionPane.showInputDialog(null, "Documento de identidad"));
                break;
                
            case 3:
                this.setTelefono(JOptionPane.showInputDialog(null, "Telefono"));
                break;
                
            case 4:
                this.setDireccion(JOptionPane.showInputDialog(null, "Direccion"));
                break;
                
            case 5:
                JOptionPane.showMessageDialog(null, g, "Genero", 1);
                this.setGenero(g.getSelectedIndex());
                break;
                
            case 6:
                JOptionPane.showMessageDialog(null, e, "Estado Civil", 1);
                this.setEstadoCivil(e.getSelectedIndex());
                break;
                
            case 7:
                JOptionPane.showMessageDialog(null, t, "Tipo de Usuario", 1);
                this.setTipoUsuario(t.getSelectedIndex());
                break;
                
            case 8:
                this.setNombreUsuario(JOptionPane.showInputDialog(null,"Nombre de usuario"));
                break;
                
            case 9:
                this.setContrasena(JOptionPane.showInputDialog(null, "Contraseña"));
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error: dato seleccionado fuera de rango");
        }
    }
    
    /*------------------
    -      getters     -
    ------------------*/
    
    /**
     * 
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * 
     * @param cc 
     */
    public void setCc(String cc) {
        this.cc = cc;
    }

    /**
     * 
     * @param telefono 
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * 
     * @param direccion 
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * 
     * @param Genero 
     */
    public void setGenero(int Genero) {
        this.genero = Genero;
    }

    /**
     * 
     * @param estadoCivil 
     */
    public void setEstadoCivil(int estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    /**
     * 
     * @param tipoUsuario 
     */
    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    /**
     * 
     * @param nombreUsuario 
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * 
     * @param contrasena 
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    /*------------------
    -      getters     -
    ------------------*/
    
    /**
     * 
     * @return 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * @return 
     */
    public String getCc() {
        return cc;
    }

    /**
     * 
     * @return 
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * 
     * @return 
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * 
     * @return 
     */
    public int getGenero() {
        return genero;
    }

    /**
     * 
     * @return 
     */
    public int getEstadoCivil() {
        return estadoCivil;
    }

    /**
     * 
     * @return 
     */
    public int getTipoUsuario() {
        return tipoUsuario;
    }

    /**
     * 
     * @return 
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * 
     * @return 
     */
    public String getContrasena() {
        return contrasena;
    }
}
