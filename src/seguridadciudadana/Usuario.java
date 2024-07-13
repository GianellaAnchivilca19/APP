/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seguridadciudadana;

/**
 *
 * @author giane
 */
public class Usuario {
    
    private String NombreCom;
    private String Correo;
    private String NumCel;
    private String Contraseña;

    public Usuario(String NombreCom, String Correo, String NumCel, String Contraseña) {
        this.NombreCom = NombreCom;
        this.Correo = Correo;
        this.NumCel = NumCel;
        this.Contraseña = Contraseña;
    }

    public String getNombreCom() {
        return NombreCom;
    }

    public void setNombreCom(String NombreCom) {
        this.NombreCom = NombreCom;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getNumCel() {
        return NumCel;
    }

    public void setNumCel(String NumCel) {
        this.NumCel = NumCel;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
    
    
    
}
