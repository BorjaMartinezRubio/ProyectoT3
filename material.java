
public class Material {
	
	String nombre;
	int stock;
		
	protected Material(String nombre, int stock) {
		super();
		this.nombre = nombre;
		this.stock = stock;
	}
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected int getStock() {
		return stock;
	}
	protected void setStock(int stock) {
		this.stock = stock;
	}
	

}
