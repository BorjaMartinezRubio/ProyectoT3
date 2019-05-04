import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class GestionActividades {

	EntradaSalida es = new EntradaSalida();
	boolean valido;

	protected void crearActividad() {
		
		valido =false;
		System.out.println(" Introduce el nombre de la actividad ");
		String nombre = es.cogerTexto();
		System.out.println("Introduce la hora de la actividad (El formato ha de ser --:--)");
		String hora = es.cogerTexto();
		String dia;
		do {
			System.out.println("Introduce el dia de la semana que se realizara la actividad");
			dia = es.cogerTexto();
			valido = comprobarDia(dia);
		} while (valido == false);

		System.out.println("Introduce la zona en la que se va a realizar la actividad");
		String zona = es.cogerTexto();

		Conexion conexion = new Conexion();
		Connection con = conexion.getConnection();
		Statement st;
		String sql = "insert into actividad (nombre,hora,dia,zona) values ('" + nombre + "','" + hora + "','" + dia
				+ "','" + zona + "')";
		try {
			st = con.createStatement();
			st.executeUpdate(sql);
			// Cierro conexiones
			st.close();
			con.close();
			System.out.println("Insertado con exito");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	protected void modificarNombre() {
		System.out.println("Introduzca el nombre, el dia y la hora  de la actividad que deseamodificar");
		String nombre = es.cogerTexto();
		String dia = es.cogerTexto();
		String hora = es.cogerTexto();
		System.out.println("Introduzca el nuevo nombre para la actividad");
		int nuevoDato = es.cogerEntero();
		Conexion conexion = new Conexion();
		Connection con = conexion.getConnection();
		Statement st;
		String sql = "update actividad set nombre ='" + nuevoDato + "' where nombre ='" + nombre + "' and dia ='" + dia
				+ "' and hora= '" + hora + "')";
		try {
			st = con.createStatement();
			int confirmar = st.executeUpdate(sql);
			if (confirmar == 1) {
				System.out.println("Nombre de la actividad cambiado con exito");
			} else {
				System.out.println("Error al modificar el campo");
			}
			st.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	protected void modificarHora() {
		System.out.println("Introduzca el nombre, el dia y la hora  de la actividad que deseamodificar");
		String nombre = es.cogerTexto();
		String dia = es.cogerTexto();
		String hora = es.cogerTexto();
		System.out.println("Introduzca la nueva hora para la actividad");
		int nuevoDato = es.cogerEntero();
		Conexion conexion = new Conexion();
		Connection con = conexion.getConnection();
		Statement st;
		String sql = "update actividad set hora ='" + nuevoDato + "' where nombre ='" + nombre + "' and dia ='" + dia
				+ "' and hora= '" + hora + "')";
		try {
			st = con.createStatement();
			int confirmar = st.executeUpdate(sql);
			if (confirmar == 1) {
				System.out.println("Hora de la actividad cambiado con exito");
			} else {
				System.out.println("Error al modificar el campo");
			}
			st.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	protected void modificarDia() {
		System.out.println("Introduzca el nombre, el dia y la hora  de la actividad que deseamodificar");
		String nombre = es.cogerTexto();
		String dia;
		valido=false;
		
		do {
			System.out.println("Introduce el nuevo dia de la semana que se realizara la actividad");
			dia = es.cogerTexto();
			valido = comprobarDia(dia);
		} while (valido == false);
		
		String hora = es.cogerTexto();
		System.out.println("Introduzca el nuevo dia para la actividad");
		int nuevoDato = es.cogerEntero();
		Conexion conexion = new Conexion();
		Connection con = conexion.getConnection();
		Statement st;
		String sql = "update actividad set dia ='" + nuevoDato + "' where nombre ='" + nombre + "' and dia ='" + dia
				+ "' and hora= '" + hora + "')";
		try {
			st = con.createStatement();
			int confirmar = st.executeUpdate(sql);
			if (confirmar == 1) {
				System.out.println("Dia de la actividad cambiado con exito");
			} else {
				System.out.println("Error al modificar el campo");
			}
			st.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	protected void modificarZona() {
		System.out.println("Introduzca el nombre, el dia y la hora  de la actividad que deseamodificar");
		String nombre = es.cogerTexto();
		String dia = es.cogerTexto();
		String hora = es.cogerTexto();
		System.out.println("Introduzca la nueva zona para la actividad");
		int nuevoDato = es.cogerEntero();
		Conexion conexion = new Conexion();
		Connection con = conexion.getConnection();
		Statement st;
		String sql = "update actividad set zona ='" + nuevoDato + "' where nombre ='" + nombre + "' and dia ='" + dia
				+ "' and hora= '" + hora + "')";
		try {
			st = con.createStatement();
			int confirmar = st.executeUpdate(sql);
			if (confirmar == 1) {
				System.out.println("Zona de la actividad cambiado con exito");
			} else {
				System.out.println("Error al modificar el campo");
			}
			st.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected boolean comprobarDia(String dia) {

		if (dia.equalsIgnoreCase("Lunes") || dia.equalsIgnoreCase("Martes") || dia.equalsIgnoreCase("Miercoles")
				|| dia.equalsIgnoreCase("Jueves") || dia.equalsIgnoreCase("Viernes") || dia.equalsIgnoreCase("Sabado")
				|| dia.equalsIgnoreCase("Domingo")) {
			valido = true;
		} else {
			valido = false;
			System.out.println("El dia de la semana introducido no es valido");
		}
		return valido;
	}

}
