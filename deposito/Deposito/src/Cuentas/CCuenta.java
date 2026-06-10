/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuentas;

/**
 *
 * @author Sergio Iturbe Sánchez
 */
public class CCuenta {
/**
 * Rec. la cuenta
 * @return 
 * @author Sergio Iturbe Sánchez
 */
    public String getCuenta() {
        return cuenta;
    }
/**
 * Rec. Saldo
 * @return 
 * @author Sergio Iturbe Sánchez
 */
    public double getSaldo() {
        return saldo;
    }
/**
 * Establecer Cuenta
 * @param cuenta 
 * @author Sergio Iturbe Sánchez
 */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
/**
 * Establecer saldo
 * @param saldo 
 * @author Sergio Iturbe Sánchez
 */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
/**
 * Atributos de Nombre-Cuenta-Tipo Interes y Saldo
 * @param antonio_López
 * @param string
 * @param par
 * @param par1 
 * @author Sergio Iturbe Sánchez
 */
    public CCuenta(String antonio_López, String string, int par, int par1) {
    }

    private String nombre;
    private String cuenta;
    private double tipoInterés;
    private double saldo;

   

    public double estado() {
        return getSaldo();
    }

    public double getTipoInterés() {
        return tipoInterés;
    }
/**
 * Si la cantidad es inferior a 0 salta Error de Cantidad Negativa
 * @param cantidad
 * @throws Exception 
 * @author Sergio Iturbe Sánchez
 */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }
/**
 * Si se introduce una cantidad inferior a 0 salta error de cantidad Negativa
 * Tambien salta error en la Cantidad si es erronea de que no hay suficiente saldo
 * @param cantidad
 * @throws Exception
 * @author Sergio Iturbe Sánchez
 */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }
/**
 * Obtencion de la cuenta
 * @return 
 * @author Sergio Iturbe Sánchez
 */
    public String obtenerCuenta() {
        return getCuenta();
    }
/**
 * Pillar el Nombre
 * @return 
 * @author Sergio Iturbe Sánchez
 */
    public String getNombre() {
        return nombre;
    }
/**
 * Asignar el nombre
 * @param nom 
 * @author Sergio Iturbe Sánchez
 */
    public void asignarNombre(String nom) {
        setNombre(nom);
    }
/**
 * Establecer el nombre
 * @param nombre 
 * @author Sergio Iturbe Sánchez
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * Establecer el tipo de Interes
 * @param tipoInterés 
 * @author Sergio Iturbe Sánchez
 */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
/**
 * Obtener el Nombre
 * @return 
 * @author Sergio Iturbe Sánchez
 */
    public String obtenerNombre() {
        return getNombre();
    }
    
}
