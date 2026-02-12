import java.util.Scanner;

public class CajeroAutomatico {

    // Menu cajero



    // Consultar saldo y Retirar dinero




    // Depositar dinero
    case 2:
        system.out.print(" Ingrese el monto de dinero que quiere retirar: ");

        double retiro = sc.nextDouble();

        if(retiro> 0 && retiro<= saldo){
            
            saldo-=retiro;
            system.out.println(" su retiro de dinero fue exitoso.");
            system.out.println(" su nuevo saldo es de: " + saldo);
        }else{

            system.out.println("no tiene el monto suficiente ingresado o es incorrecto";)
        }
        break;

                default:
                    System.out.println("Opcion invalida.");


    


    // Validaciones
}