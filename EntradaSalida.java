import java.util.*;

public class EntradaSalida {
	
	Scanner sc = new Scanner (System.in);
	
	protected String recogerString () {
		String primera;
		
		primera = sc.nextLine();
		return primera;
	}
	
	protected int recogerInt () {
		int entero;
		entero = sc.nextInt();sc.nextLine();
		return entero;
	}
	
	protected char recogerChar() {
		char caracter;
		caracter = sc.next().charAt(0);sc.nextLine();
		return caracter;
	}
	
	protected double recogerDouble() {
		double decimal;
		decimal = sc.nextDouble();sc.nextLine();
		return decimal; 
	}

	protected Empleado datosEmpleado() {
		double salario;
		String dni,nombre,apellidos,contraseña;
		int telefono,edad,antiguedad;
		char genero;
		
		System.out.print("Introduzca su DNI: ");
		dni = recogerString();
		System.out.print("Introduzca su nombre: ");
		nombre = recogerString();
		System.out.print("Introduzca sus apellidos: ");
		apellidos = recogerString();
		System.out.print("Introduzca su contraseña: ");
		contraseña = recogerString();
		System.out.print("Introduzca su edad: ");
		edad = recogerInt();
		System.out.println("Introduzca su telefono: ");
		telefono = recogerInt();
		System.out.println("Introduzca su genero(H = Hombre / M = Mujer): ");
		genero = recogerChar();
		System.out.print("Introduzca el sueldo: ");
		salario = recogerDouble();
		System.out.print("Introduzca la antiguedad: ");
		antiguedad = recogerInt();
		
		Empleado e1 = new Empleado (dni,nombre,apellidos,contraseña,edad,telefono,genero,salario,antiguedad);
		
		return e1;
	}
	
	protected Cliente datosCliente() {
		double salario;
		String dni,nombre,apellidos,contraseña;
		int telefono,edad,antiguedad;
		char genero;
		
		System.out.print("Introduzca su DNI: ");
		dni = recogerString();
		System.out.print("Introduzca su nombre: ");
		nombre = recogerString();
		System.out.print("Introduzca sus apellidos: ");
		apellidos = recogerString();
		System.out.print("Introduzca su contraseña: ");
		contraseña = recogerString();
		System.out.print("Introduzca su edad: ");
		edad = recogerInt();
		System.out.println("Introduzca su telefono: ");
		telefono = recogerInt();
		System.out.println("Introduzca su genero(H = Hombre / M = Mujer): ");
		genero = recogerChar();
		
		Cliente c1 = new Cliente (dni,nombre,apellidos,contraseña,edad,telefono,genero);
		
		return c1;
	}
}
