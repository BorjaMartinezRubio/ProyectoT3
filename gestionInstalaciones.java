import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class gestionInstalaciones {

	EntradaSalida es = new EntradaSalida();

	/*
	 * protected void CreacionInicial() { Conexion conexion = new Conexion();
	 * Connection con = conexion.getConnection(); Statement st; String sql =
	 * "insert into instalacion (nombre,localizacion,horario) values ('Piscina','Zona 1','9:30-22:00')"
	 * ; try { st = con.createStatement(); st.executeUpdate(sql); // Cierro
	 * conexiones st.close(); con.close();
	 * System.out.println("Insertado con exito"); } catch (SQLException e) {
	 * e.printStackTrace(); } }
	 */

	/*
	 * protected int buscarInstalacion () {
	 * 
	 * System.out.
	 * println("Introduzca el nombre de la instalacion que desea modificar"); String
	 * nombre = es.cogerTexto(); int idInstalacion = -1;
	 * 
	 * Conexion conexion = new Conexion(); Connection con =
	 * conexion.getConnection(); Statement st; ResultSet rs = null; String sql =
	 * "select id_intalacion from instalacion where nombre = '" + nombre+ "'"; try {
	 * st = con.createStatement(); rs = st.executeQuery(sql); if (rs.next()) {
	 * idInstalacion = rs.getInt(1); } st.close(); con.close(); } catch
	 * (SQLException e) { e.printStackTrace(); }
	 * 
	 * return idInstalacion; }
	 */

	protected void modificarZona() {
		System.out.println("Introduzca el nombre de la instalacion que desea modificar");
		String nombre = es.cogerTexto();
		System.out.println("Introduzca el nuevo datos a ingresar");
		String nuevoDato = es.cogerTexto();

		Conexion conexion = new Conexion();
		Connection con = conexion.getConnection();
		Statement st;
		String sql = "update instalacion set zona='" + nuevoDato + "' where nombre='" + nombre + "'";
		try {
			st = con.createStatement();
			int confirmar = st.executeUpdate(sql);
			if (confirmar == 1) {
				System.out.println("Localizacion modificada con éxito");
			} else {
				System.out.println("Error al modificar el campo");
			}
			st.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void modificarHorario() {
		System.out.println("Introduzca el nombre de la instalacion que desea modificar");
		String nombre = es.cogerTexto();
		System.out.println("Introduzca el nuevo horario recuerde que el formato es 00:00-00:00 ");
		String nuevoDato = es.cogerTexto();
		Conexion conexion = new Conexion();
		Connection con = conexion.getConnection();
		Statement st;
		String sql = "update instalacion set horario=" + nuevoDato + " where nombre= '" + nombre + "'";
		try {
			st = con.createStatement();
			int confirmar = st.executeUpdate(sql);
			if (confirmar == 1) {
				System.out.println("Horario modificado con éxito");
			} else {
				System.out.println("Error al modificar el campo");
			}
			st.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void modificarTemperatura() {

		System.out.println("Introduzca el nombre de la piscina que desea modificar");
		String nombre = es.cogerTexto();
		System.out.println("Introduzca el nuevo dato a ingresar");
		Double nuevoDato = es.cogerDecimal();

		Conexion conexion = new Conexion();
		Connection con = conexion.getConnection();
		Statement st;
		String sql = "update piscina set temperatura_agua ='" + nuevoDato
				+ "' where id_instalacion_aux = (select id_instalacion from instalacion where nombre ='" + nombre
				+ "')";
		try {
			st = con.createStatement();
			int confirmar = st.executeUpdate(sql);
			if (confirmar == 1) {
				System.out.println("Temperatura del agua modificada con éxito");
			} else {
				System.out.println("Error al modificar el campo");
			}
			st.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void modificarCloro() {
		System.out.println("Introduzca el nombre de la piscina que desea modificar");
		String nombre = es.cogerTexto();
		System.out.println("Introduzca el nuevo datos a ingresar");
		int nuevoDato = es.cogerEntero();
		Conexion conexion = new Conexion();
		Connection con = conexion.getConnection();
		Statement st;
		String sql = "update piscina set porcentaje_cloro ='" + nuevoDato
				+ "' where id_instalacion_aux = (select id_instalacion from instalacion where nombre ='" + nombre
				+ "')";
		try {
			st = con.createStatement();
			int confirmar = st.executeUpdate(sql);
			if (confirmar == 1) {
				System.out.println("Porcentaje de cloro en agua modificada con éxito");
			} else {
				System.out.println("Error al modificar el campo");
			}
			st.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void modificarCubiertaPisc() {
		System.out.println("Introduzca el nombre de la piscina que desea modificar");
		String nombre = es.cogerTexto();
		System.out.println("Introduzca 'Si' en caso de que este cubierta o 'No' en caso contrario");
		String nuevoDato = es.cogerTexto();
		Conexion conexion = new Conexion();
		Connection con = conexion.getConnection();
		Statement st;
		if (nuevoDato.equalsIgnoreCase("Si") || nuevoDato.equalsIgnoreCase("No")) {
			if (nuevoDato.equalsIgnoreCase("Si")) {
				String sql = "update piscina set cubierta = True where id_instalacion_aux = (select id_instalacion from instalacion where nombre ='"
						+ nombre + "')";
				try {
					st = con.createStatement();
					int confirmar = st.executeUpdate(sql);
					if (confirmar == 1) {
						System.out.println("Se ha cambiado la propiedad correctamente");
					} else {
						System.out.println("Error al modificar el campo");
					}
					st.close();
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} else {

				String sql = "update piscina set cubierta = False where id_instalacion_aux = (select id_instalacion from instalacion where nombre ='"
						+ nombre + "')";
				try {
					st = con.createStatement();
					int confirmar = st.executeUpdate(sql);
					if (confirmar == 1) {
						System.out.println("Se ha cambiado la propiedad correctamente");
					} else {
						System.out.println("Error al modificar el campo");
					}
					st.close();
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} else {

			System.out.println("No se ha relizado la modificacion");

		}
	}

	protected void modificarLastRev() {
		
		LocalDate hoy = LocalDate.now();
		Conexion conexion = new Conexion();
		Connection con = conexion.getConnection();
		Statement st;
		String sql = "update gimnasio set ultima_revision ='" + hoy
				+ "' where id_instalacion_aux = (select id_instalacion from instalacion where nombre = 'Gimnasio')";
		try {
			st = con.createStatement();
			int confirmar = st.executeUpdate(sql);
			if (confirmar == 1) {
				System.out.println("Revision actualizada a la fecha actual");
			} else {
				System.out.println("Error al modificar el campo");
			}
			st.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void modificarTerrenoPadel() {

		System.out.println("Introduzca el nombre de la pista de padel que desea modificar");
		String nombre = es.cogerTexto();
		System.out.println("Introduzca el tipo de terreno recuerde que solo puede ser 'Tierra'o 'Cemento'");
		String nuevoDato = es.cogerTexto();
		Conexion conexion = new Conexion();
		Connection con = conexion.getConnection();
		Statement st;
		if (nuevoDato.equalsIgnoreCase("Tierra") || nuevoDato.equalsIgnoreCase("Cemento")) {
			if (nuevoDato.equalsIgnoreCase("Tierra")) {
				String sql = "update pista_padel set terreno = 'Tierra' where id_instalacion_aux = (select id_instalacion from instalacion where nombre ='"
						+ nombre + "')";
				try {
					st = con.createStatement();
					int confirmar = st.executeUpdate(sql);
					if (confirmar == 1) {
						System.out.println("Tipo de terreno modificado correctamente");
					} else {
						System.out.println("Error al modificar el campo");
					}
					st.close();
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} else {

				String sql = "update pista_padel set terreno = 'Cemento' where id_instalacion_aux = (select id_instalacion from instalacion where nombre ='"
						+ nombre + "')";
				try {
					st = con.createStatement();
					int confirmar = st.executeUpdate(sql);
					if (confirmar == 1) {
						System.out.println("Tipo de terreno modificado correctamente");
					} else {
						System.out.println("Error al modificar el campo");
					}
					st.close();
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} else {

			System.out.println("No se ha relizado la modificacion");

		}
	}

	protected void modificarCubiertaPisPad() {
		System.out.println("Introduzca el nombre de la pista de padel que desea modificar");
		String nombre = es.cogerTexto();
		System.out.println("Introduzca 'Si' en caso de que este cubierta o 'No' en caso contrario");
		String nuevoDato = es.cogerTexto();
		Conexion conexion = new Conexion();
		Connection con = conexion.getConnection();
		Statement st;
		if (nuevoDato.equalsIgnoreCase("Si") || nuevoDato.equalsIgnoreCase("No")) {
			if (nuevoDato.equalsIgnoreCase("Si")) {
				String sql = "update pista_padel set cubierta = True where id_instalacion_aux = (select id_instalacion from instalacion where nombre ='"
						+ nombre + "')";
				try {
					st = con.createStatement();
					int confirmar = st.executeUpdate(sql);
					if (confirmar == 1) {
						System.out.println("Se ha cambiado la propiedad correctamente");
					} else {
						System.out.println("Error al modificar el campo");
					}
					st.close();
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} else {

				String sql = "update pista_padel set cubierta = False where id_instalacion_aux = (select id_instalacion from instalacion where nombre ='"
						+ nombre + "')";
				try {
					st = con.createStatement();
					int confirmar = st.executeUpdate(sql);
					if (confirmar == 1) {
						System.out.println("Se ha cambiado la propiedad correctamente");
					} else {
						System.out.println("Error al modificar el campo");
					}
					st.close();
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} else {

			System.out.println("No se ha relizado la modificacion");

		}
	}

	protected void modificarGradas() {
		System.out.println("Introduzca el nombre del campo de futbol que desea modificar");
		String nombre = es.cogerTexto();
		System.out.println("Introduzca 'Si' en caso de que tenga gradas o 'No' en caso contrario");
		String nuevoDato = es.cogerTexto();
		Conexion conexion = new Conexion();
		Connection con = conexion.getConnection();
		Statement st;
		if (nuevoDato.equalsIgnoreCase("Si") || nuevoDato.equalsIgnoreCase("No")) {
			if (nuevoDato.equalsIgnoreCase("Si")) {
				String sql = "update campo_futbol set gradas = True where id_instalacion_aux = (select id_instalacion from instalacion where nombre ='"
						+ nombre + "')";
				try {
					st = con.createStatement();
					int confirmar = st.executeUpdate(sql);
					if (confirmar == 1) {
						System.out.println("Se ha cambiado la propiedad correctamente");
					} else {
						System.out.println("Error al modificar el campo");
					}
					st.close();
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} else {

				String sql = "update campo_futbol set gradas = False where id_instalacion_aux = (select id_instalacion from instalacion where nombre ='"
						+ nombre + "')";
				try {
					st = con.createStatement();
					int confirmar = st.executeUpdate(sql);
					if (confirmar == 1) {
						System.out.println("Se ha cambiado la propiedad correctamente");
					} else {
						System.out.println("Error al modificar el campo");
					}
					st.close();
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} else {

			System.out.println("No se ha relizado la modificacion");

		}
	}

	protected void modificarTerrenoFutbol() {

		System.out.println("Introduzca el nombre del campo de futbol que desea modificar");
		String nombre = es.cogerTexto();
		System.out.println("Introduzca el tipo de terreno recuerde que solo puede ser 'Cesped'o 'Parquet'");
		String nuevoDato = es.cogerTexto();
		Conexion conexion = new Conexion();
		Connection con = conexion.getConnection();
		Statement st;
		if (nuevoDato.equalsIgnoreCase("Cesped") || nuevoDato.equalsIgnoreCase("Parquet")) {
			if (nuevoDato.equalsIgnoreCase("Cesped")) {
				String sql = "update campo_futbol set terreno = 'Cesped' where id_instalacion_aux = (select id_instalacion from instalacion where nombre ='"
						+ nombre + "')";
				try {
					st = con.createStatement();
					int confirmar = st.executeUpdate(sql);
					if (confirmar == 1) {
						System.out.println("Tipo de terreno modificado correctamente");
					} else {
						System.out.println("Error al modificar el campo");
					}
					st.close();
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} else {

				String sql = "update campo_futbol set terreno = 'Parquet' where id_instalacion_aux = (select id_instalacion from instalacion where nombre ='"
						+ nombre + "')";
				try {
					st = con.createStatement();
					int confirmar = st.executeUpdate(sql);
					if (confirmar == 1) {
						System.out.println("Tipo de terreno modificado correctamente");
					} else {
						System.out.println("Error al modificar el campo");
					}
					st.close();
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} else {

			System.out.println("No se ha relizado la modificacion");

		}
	}

}
