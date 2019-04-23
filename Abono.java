import java.time.LocalDate;

public class Abono {
	
	protected LocalDate caducidad;
	protected char tipoCarnet;
	gestionPersonas gesp = new gestionPersonas();

	protected Abono(LocalDate caducidad, char tipoCarnet) {
		this.caducidad = caducidad;
		this.tipoCarnet = tipoCarnet;
	}

	protected Abono() {
		// TODO Auto-generated constructor stub
	}

	protected LocalDate getCaducidad() {
		return caducidad;
	}

	protected void setCaducidad(LocalDate caducidad) {
		this.caducidad = caducidad;
	}

	protected char getTipoCarnet() {
		return tipoCarnet;
	}

	protected void setTipoCarnet(char tipoCarnet) {
		this.tipoCarnet = tipoCarnet;
	}
		
	
	public String toString() {
		String mensaje;
		mensaje = "Datos del carnet: ";
		mensaje += "\n\tTipo de carnet: " + tipoCarnet;
		mensaje += "\n\tFecha limite de uso: " + caducidad;
		return mensaje;
	}
}
