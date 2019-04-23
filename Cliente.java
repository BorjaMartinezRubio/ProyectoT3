import java.time.LocalDate;

public class Cliente extends Persona{
	
	
	
	protected Cliente(String dni, String nombre, String apellidos, String contraseña, int edad, int telefono,
			char genero) {
		super(dni, nombre, apellidos, contraseña, edad, telefono, genero);
	}

	public String toString () {
		return super.toString() + "hola";
	}

}
