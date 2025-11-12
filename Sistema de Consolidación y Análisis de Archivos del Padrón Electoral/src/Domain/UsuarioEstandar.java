/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

/**
 *
 * @author isabe
 */
public class UsuarioEstandar extends Usuario {
    
    
    public UsuarioEstandar(String cedula, String nombre, String primerApellido, String segundoApellido, String username, String password) {
        super(cedula, nombre, primerApellido, segundoApellido, username, password);
    }
    public boolean puedeEjecutarAccion(){
        return false;
    }
    
}
