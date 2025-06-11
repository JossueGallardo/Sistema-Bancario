/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabancario_;

import java.util.Date;
import java.util.LinkedList;

public class Cliente {
    private String idCliente;
    private String nombre;
    private String direccion;
    private LinkedList<Cuenta> cuentas;

    public Cliente(String idCliente, String nombre, String direccion) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.direccion = direccion;
        this.cuentas = new LinkedList<>();
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LinkedList<Cuenta> getCuentas() {
        return cuentas;
    }
    
    public void agregarCuenta(Cuenta cuenta) {
    cuentas.add(cuenta);
}
   
}
