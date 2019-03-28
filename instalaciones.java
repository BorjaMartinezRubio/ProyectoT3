
public abstract class Instalaciones {
	
	//Declaracion de atributos
	protected String localizacion, horario, nombre;
	boolean disponibilidad;
	

	protected Instalaciones(String localizacion, String horario, String nombre, boolean disponibilidad) {
		super();
		this.localizacion = localizacion;
		this.horario = horario;
		this.nombre = nombre;
		this.disponibilidad = disponibilidad;
	}

	protected String getLocalizacion() {
		return localizacion;
	}

	protected void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}

	protected String getHorario() {
		return horario;
	}

	protected void setHorario(String horario) {
		this.horario = horario;
	}

	protected boolean isDisponibilidad() {
		return disponibilidad;
	}

	protected void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
