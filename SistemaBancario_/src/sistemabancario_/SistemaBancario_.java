/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemabancario_;

import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

public class SistemaBancario_ {

    private static Banco banco;
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        inicializarBanco();
        mostrarMenu();
        
    }
    
private static void inicializarBanco() {
        System.out.print("Ingrese el nombre del banco: ");
        String nombreBanco = scanner.nextLine();
        System.out.print("Ingrese la dirección del banco: ");
        String direccionBanco = scanner.nextLine();
        banco = new Banco(nombreBanco, direccionBanco);
    }

    private static void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1. Agregar cliente");
            System.out.println("2. Agregar cuenta a un cliente");
            System.out.println("3. Agregar transacciones a una cuenta");
            System.out.println("4. Mostrar información de clientes y cuentas");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    agregarCliente();
                    break;
                case 2:
                    agregarCuentaACliente();
                    break;
                case 3:
                    agregarTransaccionesACuenta();
                    break;
                case 4:
                    mostrarInformacionClientes();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);
    }

    private static void agregarCliente() {
        System.out.print("Ingrese el ID del cliente: ");
        String idCliente = scanner.nextLine();
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = scanner.nextLine();
        System.out.print("Ingrese la dirección del cliente: ");
        String direccionCliente = scanner.nextLine();

        Cliente cliente = new Cliente(idCliente, nombreCliente, direccionCliente);
        banco.getClientes().add(cliente);
        System.out.println("Cliente agregado exitosamente.");
    }

    private static void agregarCuentaACliente() {
        System.out.print("Ingrese el ID del cliente: ");
        String idCliente = scanner.nextLine();
        Cliente cliente = buscarClientePorId(idCliente);

        if (cliente != null) {
            System.out.println("Seleccione el tipo de cuenta:");
            System.out.println("1. Cuenta Corriente");
            System.out.println("2. Cuenta de Ahorro");
            int tipoCuenta = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            System.out.print("Ingrese el número de cuenta: ");
            String numeroCuenta = scanner.nextLine();
            System.out.print("Ingrese el saldo inicial: ");
            double saldo = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer

            if (tipoCuenta == 1) {
                System.out.print("Ingrese el monto de sobregiro: ");
                double montoSobreGiro = scanner.nextDouble();
                System.out.print("Ingrese el interés de sobregiro (%): ");
                double interesSobreGiro = scanner.nextDouble();
                System.out.print("Ingrese la cantidad de cheques disponibles: ");
                int chequesDisponibles = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer

                CuentaCorriente cuentaCorriente = new CuentaCorriente(numeroCuenta, saldo, montoSobreGiro, interesSobreGiro, chequesDisponibles);
                cliente.getCuentas().add(cuentaCorriente);
                System.out.println("Cuenta corriente agregada exitosamente.");
            } else if (tipoCuenta == 2) {
                System.out.print("Ingrese la tasa de interés (%): ");
                double tasaInteres = scanner.nextDouble();
                System.out.print("Ingrese el objetivo de ahorro: ");
                double objetivoAhorro = scanner.nextDouble();
                scanner.nextLine(); // Limpiar el buffer

                CuentaAhorro cuentaAhorro = new CuentaAhorro(numeroCuenta, saldo, tasaInteres, objetivoAhorro);
                cliente.getCuentas().add(cuentaAhorro);
                System.out.println("Cuenta de ahorro agregada exitosamente.");
            } else {
                System.out.println("Tipo de cuenta no válido.");
            }
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }

    private static void agregarTransaccionesACuenta() {
    System.out.print("Ingrese el ID del cliente: ");
    String idCliente = scanner.nextLine();
    Cliente cliente = buscarClientePorId(idCliente);

    if (cliente != null) {
        System.out.print("Ingrese el número de cuenta: ");
        String numeroCuenta = scanner.nextLine();
        Cuenta cuenta = buscarCuentaPorNumero(cliente, numeroCuenta);

        if (cuenta != null) {
            System.out.print("¿Cuántas transacciones desea agregar? ");
            int numTransacciones = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            for (int i = 0; i < numTransacciones; i++) {
                System.out.print("Ingrese el tipo de transacción (Deposito/Retiro): ");
                String tipoTransaccion = scanner.nextLine();
                System.out.print("Ingrese el monto de la transacción: ");
                double montoTransaccion = scanner.nextDouble();
                scanner.nextLine();

                if (tipoTransaccion.equalsIgnoreCase("Deposito")) {
                    cuenta.deposito(montoTransaccion);
                    System.out.println("Depósito realizado y saldo actualizado.");
                } else if (tipoTransaccion.equalsIgnoreCase("Retiro")) {
                    if (cuenta.retiro(montoTransaccion)) {
                        System.out.println("Retiro realizado y saldo actualizado.");
                    } else {
                        System.out.println("Retiro no realizado. Saldo insuficiente.");
                    }
                } else {
                    System.out.println("Tipo de transacción no válido.");
                }
            }
        } else {
            System.out.println("Cuenta no encontrada.");
        }
    } else {
        System.out.println("Cliente no encontrado.");
    }
}

    private static Cliente buscarClientePorId(String idCliente) {
        for (Cliente cliente : banco.getClientes()) {
            if (cliente.getIdCliente().equals(idCliente)) {
                return cliente;
            }
        }
        return null;
    }

    private static Cuenta buscarCuentaPorNumero(Cliente cliente, String numeroCuenta) {
        for (Cuenta cuenta : cliente.getCuentas()) {
            if (cuenta.getNumeroCuenta().equals(numeroCuenta)) {
                return cuenta;
            }
        }
        return null;
    }

    private static void mostrarInformacionClientes() {
        System.out.println("\nInformación de los clientes, sus cuentas y transacciones:");
        for (Cliente cliente : banco.getClientes()) {
            System.out.println("\nCliente ID: " + cliente.getIdCliente());
            System.out.println("Nombre: " + cliente.getNombre());
            System.out.println("Dirección: " + cliente.getDireccion());
            for (Cuenta cuenta : cliente.getCuentas()) {
                System.out.println("  Número de Cuenta: " + cuenta.getNumeroCuenta());
                System.out.println("  Saldo: $" + cuenta.getSaldo());
                if (cuenta instanceof CuentaCorriente) {
                    CuentaCorriente cc = (CuentaCorriente) cuenta;
                    System.out.println("  Tipo: Cuenta Corriente");
                    System.out.println("  Monto de Sobregiro: $" + cc.getMontoSobreGiro());
                    System.out.println("  Interés de Sobregiro: " + cc.getInteresSobreGiro() + "%");
                    System.out.println("  Cheques Disponibles: " + cc.getChequesDisponibles());
                } else if (cuenta instanceof CuentaAhorro) {
                    CuentaAhorro ca = (CuentaAhorro) cuenta;
                    System.out.println("  Tipo: Cuenta de Ahorro");
                    System.out.println("  Tasa de Interés: " + ca.getTasaInteres() + "%");
                    System.out.println("  Objetivo de Ahorro: $" + ca.getObjetivoAhorro());
                }
                System.out.println("  Transacciones:");
                for (Transaccion transaccion : cuenta.getTransacciones()) {
                    System.out.println("    Tipo: " + transaccion.getTipo() + ", Monto: $" + transaccion.getMonto() + ", Fecha: " + transaccion.getFecha());
                }
            }
        }
    }
}
