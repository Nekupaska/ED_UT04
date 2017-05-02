/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package daw_ed04;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class CCuenta {
    static Scanner t=new Scanner(System.in);
    
    private String nombre;
    private String numerodeCuenta;
    private String contrasenia; //contraseña del acceso web
    private double saldo;
    private double tipoInteres;

    /**
     *
     */
    public CCuenta()
    {
    }

    /**
     *
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre=nom;
        numerodeCuenta=cue;
        saldo=sal;
    }

    /**
     *
     * @param nom
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }

    /**
     *
     * @return
     */
    public String obtenerNombre()
    {
        return getNombre();
    }

    /**
     *
     * @return
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     *
     * @param cantidad
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     *
     * @param cantidad
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    
    /**
     *
     * @param tantoPorCiento
     * @return
     */
    public double porcentaje(double tantoPorCiento){
        return getSaldo()*tantoPorCiento/100;
        
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the numerodeCuenta
     */
    public String getNumerodeCuenta() {
        return numerodeCuenta;
    }

    /**
     * @param numerodeCuenta the numerodeCuenta to set
     */
    public void setNumerodeCuenta(String numerodeCuenta) {
        this.numerodeCuenta = numerodeCuenta;
    }
    
    /**
     * @return the contrasenia
     */
    public String getContrasenia() {
        return contrasenia;
    }
    
    /**
     * @param contrasenia the contrasenia to set
     */
    public void setContrasenia(String contrasenia) {
        if (this.comprobarContrasenia()) {
            this.contrasenia= contrasenia;
        }else{
            System.out.println("Contraseña inválida");
        }
    }
    
    /**
     *
     * @return
     */
    public boolean  comprobarContrasenia(){
        System.out.println("Introduce la contraseña primero:");
        boolean correcto=false;
        for (int i = 0; i < 3; i++) {
            if (t.nextLine().equals(this.getContrasenia())) {
                correcto=true;break;
            }
        }
        return correcto;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInteres
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * @param tipoInteres the tipoInteres to set
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    
}
