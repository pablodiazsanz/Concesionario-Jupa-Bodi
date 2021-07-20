package jp.concesionario;

import java.util.Scanner;

public class ClasePrincipal {

	public static void main(String[] args) {
		System.out.println("Hola mundo de programadores");
		
		// Abro el scanner
		Scanner sc=new Scanner(System.in);

		int opcion;	
		
		do {
			// Menu principal
			System.out.println("\nMENU PRINCIPAL");
			System.out.println("1.Comprar coches");
			System.out.println("2.Vender tus coches");
			System.out.println("3.Financiación");
			System.out.println("4.Entrar como trabajador");
			System.out.println("5.Opciones");		
			System.out.println("6.Salir");
			
			System.out.println("Selecciona una opción...");
			opcion = sc.nextInt();
		
			switch(opcion) {
			case 1: // Comprar coches
				break;
				
			case 2: // Vender tus coches
				break;
				
			case 3: // Financiación
				break;
				
			case 4:	// Entrar como trabajador
				// Menu
				System.out.println("1.Añadir coche");
				System.out.println("2.Eliminar coche");
				System.out.println("3.Ver coches");
				
				System.out.println("Selecciona una opción...");
				opcion = sc.nextInt();				
				break;
				
			case 5: // Opciones
				break;
				
			case 6: // Salir
				break;
				
				default: System.out.println("Opción no válida");
			}
			
		}while (opcion !=6);		
			
	}
		
}
