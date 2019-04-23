import java.util.Scanner;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.*;

public class GestionPersonas {
	
	Scanner sc = new Scanner(System.in);
	EntradaSalida es = new EntradaSalida();
	
	int id_persona_aux;
	LocalDate hoy;
	
	protected void crearPersona() {
		
		//SOBRECARGA??
	}
	
	
	protected LocalDate fechaActual() { //OBTENER LA FECHA ACTUAL 
		LocalDate hoy = LocalDate.now();
		return hoy;
	}
	
	protected boolean comprobarAbono(Abono a1) { //COMPROBAR SI EL ABONO ESTÁ CADUCADO O NO
		boolean acceso;
		
		if(a1.getCaducidad().isAfter(fechaActual())) {
			acceso = false;
		}else {
			acceso = true;
		}
		
		return acceso;
	}
	
	protected int buscarPersona (String dni) { //OBTENER ID DE PERSONA
		ConexionBBDD conexion = new ConexionBBDD();
		Connection con = conexion.getConnection();
		Statement st;
		ResultSet rs=null;
		String sql = "select id_persona from personas where dni='"+dni+"'";
		
		try {
			st = con.createStatement();
			rs = st.executeQuery(sql);
			if (rs.next()) {
				System.out.println(rs.getInt(1));
				id_persona_aux=rs.getInt(1);
				System.out.println(id_persona_aux);
			}
			
		}catch (SQLException e) {
			System.out.println("Ha fallado la consulta");
		}
		return id_persona_aux;
	}
	
	protected int buscarCliente () { //OBTENER EL ID DE CLIENTE
		ConexionBBDD conexion = new ConexionBBDD();
		Connection con = conexion.getConnection();
		Statement st;
		ResultSet rs=null;
		int id_cliente_aux = 0;
		String sql = "select id_cliente from clientes where id_persona_aux='"+id_persona_aux+"'";
		
		try {
			st = con.createStatement();
			rs = st.executeQuery(sql);
			if (rs.next()) {
				id_cliente_aux=rs.getInt(1);
			}
			
		}catch (SQLException e) {
			System.out.println("Ha fallado la consulta");
		}
		return id_cliente_aux;
	}
	
	protected LocalDate obtenerCaducidad() {
		hoy = fechaActual();
		 return hoy.plusMonths(1);
	}
	
	protected Abono crearAbono (int tipo) {
		
		Abono a0 =null;
		
		if(tipo==1) {
			Abono a1 = new Abono (obtenerCaducidad(),'A');
			a0 = a1;
		}else if(tipo==2) {
			Abono a1 = new Abono (obtenerCaducidad(),'B');
			a0 = a1;
		}else {
			Abono a1 = new Abono (obtenerCaducidad(),'C');
			a0 = a1;
		}
		
		return a0;
		
	}
	
	protected void insertarCliente () { //INSERTAR CLIENTE EN BBDD
		
		Cliente c1 = es.datosCliente();
		
		String dni, nombre, apellidos, contraseña;
		int telefono,edad,id_persona_aux;
		char genero;
		
		dni = c1.getDni();
		nombre = c1.getNombre();
		apellidos = c1.getApellidos();
		contraseña = c1.getContraseña();
		edad = c1.getEdad();
		telefono = c1.getTelefono();
		genero = c1.getGenero();
		
		
		ConexionBBDD conexion = new ConexionBBDD();
		Connection con = conexion.getConnection();
		Statement st;
		
		String sql="insert into personas (Nombre,Apellidos,DNI,Edad,Telefono,Contraseña) values ('"+nombre+"','"+apellidos+"','"+dni+"','"+edad+"','"+telefono+"','"+contraseña+"')";
		
		try {
			st = con.createStatement();
			st.executeUpdate(sql);
			
			System.out.println("insertado con exito en personas");
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		id_persona_aux = buscarPersona(dni);
		System.out.println(id_persona_aux);
		String sql2 ="insert into clientes (id_persona_aux) values ('"+id_persona_aux+"')";
		
		try {
			st = con.createStatement();
			st.executeUpdate(sql2);
			
			
			System.out.println("insertado con exito en clientes");
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("Que tipo de abono quieres?");
		System.out.println("1 = Completo");
		System.out.println("2 = Solo gimnasio");
		System.out.println("3 = Solo piscina");
		int tipo = sc.nextInt();sc.nextLine();
		
		Abono a1 = crearAbono(tipo);
		
		int id_cliente_aux = buscarCliente();
		LocalDate caducidad = a1.getCaducidad();
		char tipo_abono = a1.getTipoCarnet();
		
		String sql3 ="insert into abono values (null,'"+caducidad+"','"+tipo_abono+"','"+id_cliente_aux+"')";
		
		try {
			st = con.createStatement();
			st.executeUpdate(sql3);
			
			
			System.out.println("Abono insertado con éxito");
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
}
