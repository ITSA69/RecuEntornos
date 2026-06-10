/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuentas;

/**
 *
 * @author DAM105
 */
public class CCuenta {

    public String getCuenta() {
        return cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

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

    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }

    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }

    public String obtenerCuenta() {
        return getCuenta();
    }

    public String getNombre() {
        return nombre;
    }

    public void asignarNombre(String nom) {
        setNombre(nom);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    public String obtenerNombre() {
        return getNombre();
    }
    
}
