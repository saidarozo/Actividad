import java.util.Scanner;

import javax.swing.JOptionPane;

public class CajeroAutomatico {

    public static void main(String[] args) {

        double saldo = 100000; // Saldo inicial
        int opcion;

        do {
            String menu = "===== CAJERO AUTOMÁTICO =====\n"
                    + "1. Consultar saldo\n"
                    + "2. Retirar dinero\n"
                    + "3. Depositar dinero\n"
                    + "4. Salir\n\n"
                    + "Seleccione una opción:";

            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {

                case 1:
                    JOptionPane.showMessageDialog(null,
                            "Su saldo actual es: $" + saldo);
                    break;

                case 2:
                    
                    break;

                case 3:
                    double deposito = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el monto a depositar:"));

                    saldo += deposito;
                    JOptionPane.showMessageDialog(null, "Depósito realizado con exito \nNuevo saldo: $" + saldo);
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null,
                            "Gracias por usar el cajero.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null,
                            "Opción inválida.");
            }

        } while (opcion != 4);
    }
}
