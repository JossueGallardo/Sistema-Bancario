/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabancario_;

import java.util.Date;
import java.util.LinkedList;

public class Banco {
    private String nombre;
    private String direccion;
    private LinkedList<Cliente> clientes;

    public Banco(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.clientes = new LinkedList<>();
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

    public LinkedList<Cliente> getClientes() {
        return clientes;
        
    }
    
    public void agregarCliente(Cliente cliente) {
    clientes.add(cliente);
}
}
