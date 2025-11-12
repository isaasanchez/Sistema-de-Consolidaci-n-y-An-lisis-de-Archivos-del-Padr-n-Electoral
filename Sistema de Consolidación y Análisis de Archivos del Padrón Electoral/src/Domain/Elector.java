/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

/**
 *
 * @author isabe
 */
public class Elector extends Persona {
    private String codigoElector;
    
    public Elector(String cedula, String nombre, String primerApellido, String segundoApellido) {
        super(cedula, nombre, primerApellido, segundoApellido);
        this.codigoElector=codigoElector;
    }

    public String getCodigoElector() {
        return codigoElector;
    }

    public void setCodigoElector(String codigoElector) {
        this.codigoElector = codigoElector;
    }

    @Override
    public String toString() {
        return "Elector{" + "codigoElector=" + codigoElector + '}';
    }
    
}
