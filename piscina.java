
public class Piscina extends Instalaciones{

	double temperaturaAgua;
	int porcentajeCloro;
	boolean cubierta;
	
	protected Piscina(String localizacion, String horario, String nombre, boolean disponibilidad,
			double temperaturaAgua, int porcentajeCloro, boolean cubierta) {
		super(localizacion, horario, nombre, disponibilidad);
		this.temperaturaAgua = temperaturaAgua;
		this.porcentajeCloro = porcentajeCloro;
		this.cubierta = cubierta;
	}

	protected double getTemperaturaAgua() {
		return temperaturaAgua;
	}

	protected void setTemperaturaAgua(double temperaturaAgua) {
		this.temperaturaAgua = temperaturaAgua;
	}

	protected int getPorcentajeCloro() {
		return porcentajeCloro;
	}

	protected void setPorcentajeCloro(int porcentajeCloro) {
		this.porcentajeCloro = porcentajeCloro;
	}

	protected boolean isCubierta() {
		return cubierta;
	}

	protected void setCubierta(boolean cubierta) {
		this.cubierta = cubierta;
	}
	
	
}
