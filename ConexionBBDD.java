import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBBDD {
	private final String servidor="jdbc:mysql://localhost/polideportivo";
	private final String user="root";
	private final String pass="";
	private final String driver="com.mysql.jdbc.Driver";
	private Connection conexion;

	public ConexionBBDD() {

		try {
			Class.forName(driver);
			conexion=DriverManager.getConnection(servidor,user,pass);
			System.out.println("Conexion realizada con exito");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Conexion fallida");
		}
	}

	public Connection getConnection(){
		return conexion;
	}
}