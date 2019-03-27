
public class Abono {
	
	protected int numCarnet;
	protected String fechaLimite, dniPropietario;
	protected char tipoCarnet;
	
	protected Abono(int numCarnet, String fechaLimite, String dniPropietario, char tipoCarnet) {
		super();
		this.numCarnet = numCarnet;
		this.fechaLimite = fechaLimite;
		this.dniPropietario = dniPropietario;
		this.tipoCarnet = tipoCarnet;
	}

	protected int getNumCarnet() {
		return numCarnet;
	}

	protected void setNumCarnet(int numCarnet) {
		this.numCarnet = numCarnet;
	}

	protected String getFechaLimite() {
		return fechaLimite;
	}

	protected void setFechaLimite(String fechaLimite) {
		this.fechaLimite = fechaLimite;
	}

	protected String getDniPropietario() {
		return dniPropietario;
	}

	protected void setDniPropietario(String dniPropietario) {
		this.dniPropietario = dniPropietario;
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
		mensaje += "\n\tDNI del propietario: " + dniPropietario;
		mensaje += "\n\tTipo de carnet: " + tipoCarnet;
		mensaje += "\n\tNumero de carnet: " + numCarnet;
		mensaje += "\n\tFecha limite de uso: " + fechaLimite;
		return mensaje;
	}
}
