/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package daw_ed04;

/**
 *
 * @author alumno
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        CCuenta a = new CCuenta("Felipe Segundo","2222-2222-22-1230456789", 2222,0);
        
        
        
        System.out.println("Saldo actual: "+ a.getSaldo());

        ingresoOretirada(a, 2300);
        ingresoOretirada(a, 600);
        
        imprimirDatos(a);
    }

    /**
     * Imprime los datos de la cuenta bancaria
     * recibe como parámetro un objecto de tipo CCuenta "a" 
     * @param a
     */
    public static void imprimirDatos(CCuenta a) {
        System.out.println("Datos de la cuenta: "+ a.getNombre() + a.getNumerodeCuenta() + a.getSaldo() + a.getTipoInteres());
    }
    
    /**
     * Sirve para ingresar o retirar saldo dependiendo del símbolo del parámetro cantidad. Se le pasa un objecto CCuenta como parámetro.
     * @param cuenta
     * @param cantidad
     */
    public static void ingresoOretirada(CCuenta cuenta, double cantidad){
        try{
            
        if (cantidad>=0) {
            cuenta.ingresar(cantidad);
        }else{
            cuenta.retirar(cantidad);
        }
        }catch (Exception e){
            System.out.println("Error de transferencia");
        }
    }
    
    
}
