
package pe.web.app.bd;

import java.sql.*;


public class AccesoMSSQLRC {
    
    public AccesoMSSQLRC() {
	}
	
	public static Connection getConnection() throws SQLException{
		Connection con=null;
		try {
			//Datos:
			String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
			String url="jdbc:sqlserver://192.168.1.74:1433;databaseName=BDTemporal";
			String user="UserJoaquin";
			String pwd="123456";
                        
                        
			Class.forName(driver).newInstance();
			con=DriverManager.getConnection(url, user, pwd);
                        
		} catch (ClassNotFoundException e) {
			throw new SQLException("No se encontro driver.");
		} catch (SQLException e){
			throw e;
		} catch (Exception e){
			throw new SQLException("Error en la conexion de base de datos.");
		}
		return con;
	}

//  //prueba de conexion a BDSQL      
//        public static void main(String[] args) {
//       
//            AccesoMSSQLRC prue=new AccesoMSSQLRC();
//    } 
    
     
        
}
