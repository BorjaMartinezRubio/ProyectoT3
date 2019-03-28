
public class Gimnasio extends Instalaciones{

	private boolean asistentePersonal; 
	

	protected Gimnasio(String localizacion, String horario, String nombre, boolean disponibilidad,
			boolean asistentePersonal) {
		super(localizacion, horario, nombre, disponibilidad);
		this.asistentePersonal = asistentePersonal;
	}

	protected boolean isAsistentePersonal() {
		return asistentePersonal;
	}

	protected void setAsistentePersonal(boolean asistentePersonal) {
		this.asistentePersonal = asistentePersonal;
	}	
	

}
