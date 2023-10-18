/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresaeventos;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/**
 *
 * @author DIEGO ALTAMIRANO
 */
public class Test {
    public static void main(String[] args) {
        int opcion=1;
        Scanner teclado= new Scanner(System.in);
        LocalDate fechaFinConcierto = LocalDate.of(2023,Month.OCTOBER,02);
        LocalDate fechaInicioConcierto = LocalDate.of(2023, Month.SEPTEMBER, 25);
        /*
        Desde una clase que contiene el main debe contener un menú que permita:
•    Crear un evento a un cliente
• Mostrar la información del evento.
• Realizar un descuento a un cliente.
        */
        
        do {            
            System.out.println("       MENU");
            System.out.println("1) Crear un evento a un cliente.");
            System.out.println("2) Mostrar la informacion del evento.");
            System.out.println("3) Realizar un descuento a un cliente.");
            System.out.println("4) SALIR");
            opcion= teclado.nextInt();

            Evento evento1 = new Evento(500000, "Concierto Morad", "Santiago teatro coliseo", fechaInicioConcierto, fechaFinConcierto);
            //Cliente cliente1 = new Cliente();  
            Cliente cliente1 = new Cliente('N',"diego@gmail.com", "Diego Altamirano", evento1, 12345678);
            switch (opcion) {
                case 1:
                    
                    cliente1.crearEventoCliente("Santiago teatro coliseo", fechaFinConcierto, fechaInicioConcierto, "Concierto Morad", 500000);
                    System.out.println("Se ha añadido el evento "+ evento1.getNombreEvento() + " al cliente " + cliente1.getNombreCliente());
                    break;
                case 2:
                    System.out.println("Mostrando informacion del evento....");
                    evento1.mostrarInfoEvento();
                    break;
                case 3:
                    int total = evento1.total();

                    cliente1.realizarDescuento(10,total);
                    break;
                case 4:
                    cliente1.correoRecordatorio(fechaInicioConcierto);
                    System.out.println("Has salido del programa.");
                    break;
                default:
                    System.out.println("Debes ingresar una opcion válida.");
                    break;
            }
            
            
        } while (opcion!=4);
    }
}
