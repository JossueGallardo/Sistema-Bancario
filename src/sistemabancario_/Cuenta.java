/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabancario_;

import java.util.Date;
import java.util.LinkedList;

public class Cuenta {
    protected String numeroCuenta;
    protected double saldo;
    protected LinkedList<Transaccion> transacciones;

    public Cuenta(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.transacciones = new LinkedList<>();
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public LinkedList<Transaccion> getTransacciones() {
        return transacciones;
    }

    // Nuevo método para realizar depósitos
    public void deposito(double monto) {
        if (monto > 0) {
            saldo += monto;
            transacciones.add(new Transaccion("Deposito", monto, new Date()));
        } else {
            System.out.println("El monto a depositar debe ser positivo.");
        }
    }

    // Nuevo método para realizar retiros
    public boolean retiro(double monto) {
        if (monto > 0 && saldo >= monto) {
            saldo -= monto;
            transacciones.add(new Transaccion("Retiro", monto, new Date()));
            return true;
        } else {
            System.out.println("Saldo insuficiente o monto no válido.");
            return false;
        }
    }
    
    public String obtenerMovimientos() {
        StringBuilder movimientos = new StringBuilder();
        for (Transaccion transaccion : transacciones) {
            movimientos.append("Fecha: ").append(transaccion.getFecha())
                       .append(" | Tipo: ").append(transaccion.getTipo())
                       .append(" | Monto: ").append(transaccion.getMonto())
                       .append("\n");
        }
        return movimientos.toString();
    }

    
}
