import java.util.Scanner;
import javax.swing.JOptionPane;

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
    // Consultar saldo y Retirar dinero
 

          

                case 1:
                    JOptionPane.showMessageDialog(null,
                            "Su saldo actual es: $" + saldo);
                    break;

                case 2:

        double retiro = Double.parseDouble(
            JOptionPane.showInputDialog" Ingrese el monto que quiera retirar:"
        );

        if(retiro> 0 && retiro<= saldo){
            
            saldo-=retiro;
            JOptionPane.showMessageDialog(null, "Retiro exitoso.\n ingrese el nuevo saldo " + saldo);

        }else{

            JOptionPane.showMessageDialog(null,"no tiene el monto suficiente ingresado o es incorrecto";)
        }
        break;
                case 3:
                    
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
