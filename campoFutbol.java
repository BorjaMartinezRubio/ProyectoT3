
public class CampoFutbol extends Instalaciones{

	String tipo,terreno;
	boolean gradas;
	
	protected CampoFutbol(String localizacion, String horario, String nombre, boolean disponibilidad, String tipo,
			String terreno, boolean gradas) {
		super(localizacion, horario, nombre, disponibilidad);
		this.tipo = tipo;
		this.terreno = terreno;
		this.gradas = gradas;
	}

	protected String getTipo() {
		return tipo;
	}

	protected void setTipo(String tipo) {
		this.tipo = tipo;
	}

	protected String getTerreno() {
		return terreno;
	}

	protected void setTerreno(String terreno) {
		this.terreno = terreno;
	}

	protected boolean isGradas() {
		return gradas;
	}

	protected void setGradas(boolean gradas) {
		this.gradas = gradas;
	}
	
	
}
