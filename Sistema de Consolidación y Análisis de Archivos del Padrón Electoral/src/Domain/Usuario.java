/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

import java.time.LocalDate;

/**
 *
 * @author isabe
 */
public class Usuario extends Persona{
    private String username;
     private String password;
     private boolean activo;
     private LocalDate fechaCreacion;
    
    public Usuario(String cedula, String nombre, String primerApellido, String segundoApellido, String username, String password) {
        super(cedula, nombre, primerApellido, segundoApellido);
        this.username=username;
        this.password=password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public boolean validarCredenciales(String username, String password){
        
        return true;
    }
    public boolean esAdministrador(){
        return false;
    }

    @Override
    public String toString() {
        return "Usuario{" + "username=" + username + ", password=" + password + ", activo=" + activo + ", fechaCreacion=" + fechaCreacion + '}';
    }
        
    
}
