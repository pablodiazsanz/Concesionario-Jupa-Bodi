package jp.concesionario;

import java.util.Scanner;

public class ClasePrincipal {

	public static void main(String[] args) {

		// Aqui llamamos al metodo menu de la clase EntradaSalida y nos devuelve un
		// numero entero que es la opcion
		int opcion = EntradaSalida.menuPrincipal();

		do {
			switch (opcion) {
			case 1: // Comprar coches
				break;

			case 2: // Vender tus coches
				break;

			case 3: // Financiaci�n
				break;

			case 4: // Entrar como trabajador
				
				// MENU DEL TRABAJADOR (JUAN)
				// Menu
				System.out.println("1.A�adir coche");
				System.out.println("2.Eliminar coche");
				System.out.println("3.Ver coches");

				System.out.println("Selecciona una opci�n...");
				//opcion = sc.nextInt();
				break;

			case 5: // Opciones
				break;

			case 6: // Salir
				break;

			default:
				System.out.println("Opcion no valida");
			}

		} while (opcion != 6);

	}

}
