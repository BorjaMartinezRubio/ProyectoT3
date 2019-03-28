
public class PistaPadel extends Instalaciones{
	
	private String terreno;
	private boolean cubierta;
	
	protected PistaPadel(String localizacion, String horario, String nombre, boolean disponibilidad, String terreno,
			boolean cubierta) {
		super(localizacion, horario, nombre, disponibilidad);
		this.terreno = terreno;
		this.cubierta = cubierta;
	}

	protected String getTerreno() {
		return terreno;
	}

	protected void setTerreno(String terreno) {
		this.terreno = terreno;
	}

	protected boolean isCubierta() {
		return cubierta;
	}

	protected void setCubierta(boolean cubierta) {
		this.cubierta = cubierta;
	}
	
	

}
