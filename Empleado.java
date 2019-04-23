
public class Empleado extends Persona implements Trabajadores {
	private double salario;
	private int antiguedad;
	
	protected Empleado(String dni, String nombre, String apellidos, String contraseña, int edad, int telefono,
			char genero, double salario, int antiguedad) {
		super(dni, nombre, apellidos, contraseña, edad, telefono, genero);
		this.salario = salario;
		this.antiguedad = antiguedad;
	}
	
	protected double getSalario() {
		return salario;
	}
	protected void setSalario(double salario) {
		this.salario = salario;
	}
	protected int getAntiguedad() {
		return antiguedad;
	}
	protected void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	
	
}
