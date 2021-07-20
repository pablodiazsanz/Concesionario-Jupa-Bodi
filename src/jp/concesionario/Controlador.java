package jp.concesionario;

public class Controlador {

	public static void arrancarPrograma() {

		// Aqui llamamos al metodo menu de la clase EntradaSalida y nos devuelve un
		// numero entero que es la opcion
		int opcion;

		do {
			opcion = EntradaSalida.menuPrincipal();
			switch (opcion) {
			case 1: // Comprar coches
				break;

			case 2: // Vender tus coches
				break;

			case 3: // Financiacion
				break;

			case 4: // Entrar como trabajador
				// AQUI ES DONDE VAMOS A TRABAJAR (PROGRAMA JUAN)
				arrancarMenuTrabajador();
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

	private static void arrancarMenuTrabajador() {
		// TODO Auto-generated method stub
		
	}

}
