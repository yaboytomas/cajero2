package cuentas;

import java.util.ArrayList;

public class AppCuentaCorriente {

    public static void main(String[] args) {
        // Instanciar las cuentas
        CuentaCorriente nuevaCuenta1 = new CuentaCorriente("Tomas", new ArrayList<>(), 2222000);
        CuentaCorriente nuevaCuenta2 = new CuentaCorriente("Kika", new ArrayList<>(), 1111000);


        // Abonar y cargar movimientos cuenta 1
        nuevaCuenta1.abonar(100);
        nuevaCuenta1.cargar(30);
        nuevaCuenta1.abonar(200);
        nuevaCuenta1.cargar(50);
        nuevaCuenta1.abonar(300);
        nuevaCuenta1.cargar(70);
        nuevaCuenta1.abonar(400);
        nuevaCuenta1.cargar(90);
        nuevaCuenta1.abonar(500);
        nuevaCuenta1.cargar(110);
        nuevaCuenta1.abonar(500);
        nuevaCuenta1.cargar(110);

        // Abonar y cargar movimientos cuenta 2
        nuevaCuenta2.abonar(600);
        nuevaCuenta2.cargar(30);
        nuevaCuenta2.abonar(700);
        nuevaCuenta2.cargar(50);
        nuevaCuenta2.abonar(800);
        nuevaCuenta2.cargar(70);
        nuevaCuenta2.abonar(900);
        nuevaCuenta2.cargar(90);
        nuevaCuenta2.abonar(1000);
        nuevaCuenta2.cargar(110);
        nuevaCuenta2.abonar(1100);
        nuevaCuenta2.cargar(110);

        // Imprimir últimos 10 movimientos de la cuenta 1
        System.out.println("");
        System.out.println("Últimos 10 movimientos de la cuenta: " + nuevaCuenta1.getTitular());
        System.out.println("Saldo de cuenta: $" + nuevaCuenta1.getSaldo());
        System.out.println("-------------------------------------------------");
        System.out.println("Movimientos:");
        System.out.println("-------------------------------------------------");

        for (Movimientos movimiento : nuevaCuenta1.getMovimientos()) {
            if (movimiento != null) {
                System.out.println(movimiento);
            }
        }


        // imprimir los últimos 10 movimientos de la cuenta 2
        System.out.println("");
        System.out.println("Últimos 10 movimientos de la cuenta: " + nuevaCuenta2.getTitular());
        System.out.println("Saldo de cuenta: $" + nuevaCuenta2.getSaldo());
        System.out.println("-------------------------------------------------");
        System.out.println("Movimientos:");
        System.out.println("-------------------------------------------------");

        for (Movimientos movimiento : nuevaCuenta2.getMovimientos()) {
            if (movimiento != null) {
                System.out.println(movimiento);
            }
        }

    }
}
