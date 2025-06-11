/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabancario_;

import java.util.Date;
import java.util.LinkedList;

public class CuentaCorriente extends Cuenta {
    private double montoSobreGiro;
    private double interesSobreGiro;
    private int chequesDisponibles;

    public CuentaCorriente(String numeroCuenta, double saldo, double montoSobreGiro, double interesSobreGiro, int chequesDisponibles) {
        super(numeroCuenta, saldo);
        this.montoSobreGiro = montoSobreGiro;
        this.interesSobreGiro = interesSobreGiro;
        this.chequesDisponibles = chequesDisponibles;
    }

    public double getMontoSobreGiro() {
        return montoSobreGiro;
    }

    public void setMontoSobreGiro(double montoSobreGiro) {
        this.montoSobreGiro = montoSobreGiro;
    }

    public double getInteresSobreGiro() {
        return interesSobreGiro;
    }

    public void setInteresSobreGiro(double interesSobreGiro) {
        this.interesSobreGiro = interesSobreGiro;
    }

    public int getChequesDisponibles() {
        return chequesDisponibles;
    }

    public void setChequesDisponibles(int chequesDisponibles) {
        this.chequesDisponibles = chequesDisponibles;
    }
}
