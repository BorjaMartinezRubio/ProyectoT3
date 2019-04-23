
public abstract class Persona {

	// Declaracion de los atributos
	protected String dni, nombre, apellidos, contrase�a;
	protected int edad, telefono;
	protected char genero;

	protected Persona(String dni, String nombre, String apellidos, String contrase�a, int edad, int telefono,
			char genero) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.contrase�a = contrase�a;
		this.edad = edad;
		this.telefono = telefono;
		this.genero = genero;
	}

	// Declaracion de getters y setters
	protected String getDni() {
		return dni;
	}

	protected void setDni(String dni) {
		this.dni = dni;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getApellidos() {
		return apellidos;
	}

	protected void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	protected int getEdad() {
		return edad;
	}

	protected void setEdad(int edad) {
		this.edad = edad;
	}

	protected int getTelefono() {
		return telefono;
	}

	protected void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	protected char getGenero() {
		return genero;
	}

	protected void setGenero(char genero) {
		this.genero = genero;
	}

	protected String getContrase�a() {
		return contrase�a;
	}

	protected void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	public String toString() {
		String mensaje;
		mensaje = "Datos personales: ";
		mensaje += "\n\tNombre: " + nombre;
		mensaje += "\n\tApellidos: " + apellidos;
		mensaje += "\n\tGenero: " + genero;
		mensaje += "\n\tDNI: " + dni;
		mensaje += "\n\tTelefono: " + telefono;
		mensaje += "\n\tEdad: " + edad;
		return mensaje;
	}

}
