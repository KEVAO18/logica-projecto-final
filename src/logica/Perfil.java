package logica;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 * 
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
        String[] gen = {
            "Femenino", 
            "Masculino", 
            "No binario", 
            "Otros"
        };
        String[] estCivil = {
            "Casado(a)", 
            "Soltero(a)", 
            "Divorciado(a)", 
            "Union Libre", 
            "Viudo(a)", 
            "Otros"
        };
        String[] tipoUsu = {
            "Administrador", 
            "Dueño", 
            "Cliente"
        };
        
        JComboBox g = new JComboBox(gen);
        g.setSelectedIndex(0);
        JComboBox e = new JComboBox(estCivil);
        e.setSelectedIndex(0);
        JComboBox t = new JComboBox(tipoUsu);
        t.setSelectedIndex(0);
        
        this.setNombre(JOptionPane.showInputDialog(
                null, 
                "Nombre: "
        ));
        
        this.setCc(JOptionPane.showInputDialog(
                null, 
                "Documento de identidad"
        ));
        
        this.setTelefono(JOptionPane.showInputDialog(
                null, 
                "Telefono"
        ));
        
        this.setDireccion(JOptionPane.showInputDialog(
                null, 
                "Direccion"
        ));
        
        
        JOptionPane.showMessageDialog(
                null, 
                g, 
                "Genero", 
                0
        );
        this.setGenero(g.getSelectedIndex());
        
        
        JOptionPane.showMessageDialog(
                null, 
                e, 
                "Estado Civil", 
                0
        );
        this.setEstadoCivil(e.getSelectedIndex());
        
        
        JOptionPane.showMessageDialog(
                null, 
                t, 
                "Tipo de Usuario", 
                0
        );
        this.setTipoUsuario(t.getSelectedIndex());
        
        
        this.setNombreUsuario(JOptionPane.showInputDialog(
                null, 
                "Nombre de usuario"
        ));
        
        this.setContrasena(JOptionPane.showInputDialog(
                null,  
                "Contraseña"
        ));
    }

    /**
     * 
     * Actualiza la informacion de un usuario registrado
     * 
     * @param id identidicador de la opcion que se va a actualizar
     * 
     */
    public void actualizarPerfil(int id){
        
        String[] gen = {
            "Femenino", 
            "Masculino", 
            "No binario", 
            "Otros"
        };
        
        String[] estCivil = {
            "Casado(a)", 
            "Soltero(a)", 
            "Divorciado(a)", 
            "Union Libre", 
            "Viudo(a)", 
            "Otros"
        };
        
        String[] tipoUsu = {
            "Administrador", 
            "Dueño", 
            "Cliente"
        };
        
        JComboBox g = new JComboBox(gen);
        g.setSelectedIndex(0);
        JComboBox e = new JComboBox(estCivil);
        e.setSelectedIndex(0);
        JComboBox t = new JComboBox(tipoUsu);
        t.setSelectedIndex(0);
        
        switch (id) {
            case 0:
                this.setNombre(JOptionPane.showInputDialog(
                        null, 
                        "Nombre: ",
                        this.getNombre()
                ));
                break;
            
            case 1:
                this.setCc(JOptionPane.showInputDialog(
                        null, 
                        "Documento de identidad: ",
                        this.getCc()
                ));
                break;
                
            case 2:
                this.setTelefono(JOptionPane.showInputDialog(
                        null, 
                        "Telefono: ",
                        this.getTelefono()
                ));
                break;
                
            case 3:
                this.setDireccion(JOptionPane.showInputDialog(
                        null, 
                        "Direccion: ",
                        this.getDireccion()
                ));
                break;
                
            case 4:
                g.setSelectedIndex(this.getGenero());
                JOptionPane.showMessageDialog(
                        null, 
                        g,
                        "Genero: ",
                        1
                );
                this.setGenero(g.getSelectedIndex());
                break;
                
            case 5:
                e.setSelectedIndex(this.getEstadoCivil());
                JOptionPane.showMessageDialog(
                        null, 
                        e, 
                        "Estado Civil: ", 
                        1
                );
                this.setEstadoCivil(e.getSelectedIndex());
                break;
                
            case 6:
                t.setSelectedIndex(this.getTipoUsuario());
                JOptionPane.showMessageDialog(
                        null, 
                        t, 
                        "Tipo de Usuario: ", 
                        1
                );
                this.setTipoUsuario(t.getSelectedIndex());
                break;
                
            case 7:
                this.setNombreUsuario(JOptionPane.showInputDialog(
                        null,
                        "Nombre de usuario: ",
                        this.getNombreUsuario()
                ));
                break;
                
            case 8:
                this.setContrasena(JOptionPane.showInputDialog(
                        null, 
                        "Contraseña: ",
                        this.getContrasena()
                ));
                break;
                
            default:
                JOptionPane.showMessageDialog(
                        null, 
                        "Error: dato seleccionado fuera de rango"
                );
        }
    }
    
    /*------------------
    -      getters     -
    ------------------*/
    
    /**
     * 
     * @param nombre {@value xxxxxx xxxxxx xxxxxx xxxxx}
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * 
     * @param cc {@value xxxxxxxxxx}
     */
    public void setCc(String cc) {
        this.cc = cc;
    }

    /**
     * 
     * @param telefono {@value xxx-xxx-xx-xx}
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * 
     * @param direccion {@value cll xx # xx-xx}
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * 
     * @param Genero {@value [0-3]}
     */
    public void setGenero(int Genero) {
        this.genero = Genero;
    }

    /**
     * 
     * @param estadoCivil {@value [0-5]}
     */
    public void setEstadoCivil(int estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    /**
     * 
     * @param tipoUsuario {@value [0-2]}
     */
    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    /**
     * 
     * @param nombreUsuario {@value String}
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * 
     * @param contrasena {@value String}
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    /*------------------
    -      getters     -
    ------------------*/
    
    /**
     *  
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *  
     * @return cc
     */
    public String getCc() {
        return cc;
    }

    /**
     *  
     * @return telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     *  
     * @return direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * 
     * @return genero
     */
    public int getGenero() {
        return genero;
    }

    /**
     * 
     * @return estadoCivil
     */
    public int getEstadoCivil() {
        return estadoCivil;
    }

    /**
     * 
     * @return tipoUsuario
     */
    public int getTipoUsuario() {
        return tipoUsuario;
    }

    /**
     * 
     * @return nombreUsuario
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * 
     * @return contrasena
     */
    public String getContrasena() {
        return contrasena;
    }

}
