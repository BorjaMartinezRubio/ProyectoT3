import java.time.LocalDate;

public class Cliente extends Persona{
	
	
	
	protected Cliente(String dni, String nombre, String apellidos, String contraseņa, int edad, int telefono,
			char genero) {
		super(dni, nombre, apellidos, contraseņa, edad, telefono, genero);
	}

	public String toString () {
		return super.toString() + "hola";
	}

}
