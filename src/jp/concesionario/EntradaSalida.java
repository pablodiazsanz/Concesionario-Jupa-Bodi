package jp.concesionario;

import java.util.Scanner;

public class EntradaSalida {

	public static int menuPrincipal() {
		// Abro el scanner
		Scanner sc = new Scanner(System.in);

		// Creamos la variable de la opcion
		int opcion;

		// Escribo las lineas del menu
		System.out.println("MENU PRINCIPAL");
		System.out.println("1.Comprar coches");
		System.out.println("2.Vender tus coches");
		System.out.println("3.Financiacion");
		System.out.println("4.Entrar como trabajador");
		System.out.println("5.Opciones");
		System.out.println("6.Salir");

		// Selecciono una opcion
		System.out.println("Selecciona una opcion...");
		opcion = sc.nextInt();

		// Devolvemos la opcion
		return opcion;
	}

	public static int menuTrabajador() {
		// Abro el scanner
		Scanner sc = new Scanner(System.in);

		// Creamos la variable de la opcion
		int opcion;
		System.out.println("1.Anadir coche");
		System.out.println("2.Eliminar coche");
		System.out.println("3.Ver coches");

		// Selecciono una opcion
		System.out.println("Selecciona una opcion...");
		opcion = sc.nextInt();

		// Devolvemos la opcion
		return opcion;

	}
}
