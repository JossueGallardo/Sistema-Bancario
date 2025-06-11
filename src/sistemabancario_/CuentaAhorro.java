/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabancario_;

import java.util.Date;
import java.util.LinkedList;

public class CuentaAhorro extends Cuenta {
    private double tasaInteres;
    private double objetivoAhorro;

    public CuentaAhorro(String numeroCuenta, double saldo, double tasaInteres, double objetivoAhorro) {
        super(numeroCuenta, saldo);
        this.tasaInteres = tasaInteres;
        this.objetivoAhorro = objetivoAhorro;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public double getObjetivoAhorro() {
        return objetivoAhorro;
    }

    public void setObjetivoAhorro(double objetivoAhorro) {
        this.objetivoAhorro = objetivoAhorro;
    }
}
