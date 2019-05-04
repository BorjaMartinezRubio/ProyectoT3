
public class Actividades {

	protected String nombre, hora, dia, zona;

	protected Actividades(String nombre, String hora, String dia, String zona) {
		this.nombre = nombre;
		this.hora = hora;
		this.dia = dia;
		this.zona = zona;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getHora() {
		return hora;
	}

	protected void setHora(String hora) {
		this.hora = hora;
	}

	protected String getDia() {
		return dia;
	}

	protected void setDia(String dia) {
		this.dia = dia;
	}

	protected String getZona() {
		return zona;
	}

	protected void setZona(String zona) {
		this.zona = zona;
	}
	
	
}
