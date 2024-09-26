
package ventaentrada;

import java.util.Scanner;
//falta descuento y stock

public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner ingreso =new Scanner(System.in);
    
    Evento evento1 = new Evento("Conicierto","Estadio Nacional");
    Evento evento2 = new Evento("Obra de teatro","Teatro municipal");
    Evento evento3 = new Evento("Partido de futbol","Estadio Monumental");
    
    System.out.println("Ingresa tu nombre: ");
        String nombre = ingreso.nextLine();
            
    System.out.println("Ingresa tu edad: ");
        int edad = ingreso.nextInt();

    Cliente nuevoCliente = new Cliente(nombre,edad);
        System.out.println(nuevoCliente.getNombre());
    
    System.out.println("Por favor eliga un evento: ");
    System.out.println("1. "+evento1.getNombre());
    System.out.println("2. "+evento2.getNombre());
    System.out.println("3. "+evento3.getNombre());
    
        int tipoEvento =ingreso.nextInt();
        ingreso.nextLine();
        
        Evento eventoSeleccionado = null;
        if (tipoEvento == 1){
            eventoSeleccionado = evento1;
        }else if (tipoEvento == 2){
            eventoSeleccionado = evento2;
        }else if (tipoEvento == 3){
            eventoSeleccionado = evento3;
        }else{
            System.out.println("opción invalida");
            return;
        }
    System.out.println("Selecciona el tipo de entrada (VIP o Normal):");
    String tipoEntrada = ingreso.nextLine();
    
        double precio = 0.0;
        if (tipoEntrada.equalsIgnoreCase("VIP")) {
            precio = 150000.00;  // Precio para entrada VIP
        } else if (tipoEntrada.equalsIgnoreCase("Normal")) {
            precio = 80000.00;   // Precio para entrada Normal
        } else {
            System.out.println("Tipo de entrada inválido");
            return; // Termina el programa si el tipo de entrada es incorrecto
        }
         System.out.println("\nHas seleccionado:");
        System.out.println("Evento: " + eventoSeleccionado.getNombre());
        System.out.println("Ubicación: " + eventoSeleccionado.getUbicacion());
        System.out.println("Tipo de entrada: " + tipoEntrada);
        System.out.println("Precio: $" + precio);
    }   
}
