
public class Abono {
	
	protected String fechaLimite;
	protected char tipoCarnet;
	
	protected Abono( String fechaLimite, char tipoCarnet) {
		super();
		this.fechaLimite = fechaLimite;
		this.tipoCarnet = tipoCarnet;
	}

	protected String getFechaLimite() {
		return fechaLimite;
	}

	protected void setFechaLimite(String fechaLimite) {
		this.fechaLimite = fechaLimite;
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
		mensaje += "\n\tFecha limite de uso: " + fechaLimite;
		return mensaje;
	}
}
