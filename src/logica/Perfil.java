/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author ADMIN
 */
public class Perfil {

    private String nombre;
    private String cc;
    private String  telefono;
    private String direccion;
    private int Genero;
    private int estadoCivil;
    private int tipoUsuario;
    private String nombreUsuario;
    private String contrasena;
    
    public Perfil() {
        
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setCc(String cc) {
        this.cc = cc;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setGenero(int Genero) {
        this.Genero = Genero;
    }

    public void setEstadoCivil(int estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCc() {
        return cc;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getGenero() {
        return Genero;
    }

    public int getEstadoCivil() {
        return estadoCivil;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }    
}
