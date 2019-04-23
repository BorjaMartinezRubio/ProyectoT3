import java.util.Scanner;

public class Menus {
	Scanner sc = new Scanner(System.in);
	
	protected void crearPersona() {
		String dni,nombre,apellidos,contraseña;
		int telefono,edad;
		char genero;
		
		System.out.print("Introduzca su DNI: ");
		dni = sc.nextLine();
		System.out.print("Introduzca su nombre: ");
		nombre = sc.nextLine();
		System.out.print("Introduzca sus apellidos: ");
		apellidos = sc.nextLine();
		System.out.print("Introduzca su contraseña: ");
		contraseña = sc.nextLine();
		System.out.print("Introduzca su edad: ");
		edad = sc.nextInt();sc.nextLine();
		System.out.println("Introduzca su telefono: ");
		sc.nextInt();sc.nextLine();
		System.out.println("Introduzca su genero(H = Hombre / M = Mujer): ");
		genero = sc.next().charAt(0);sc.nextLine();
	}

}
