/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.web.app.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author soporte2
 */
public class AccesoMSSQL {
    
     private String USERNAME="sa";
        private String PASSWORD="diversion";
        //private String HOST="localhost";
        //private String PORT="3306";
       // private String DATABASE="comercio";
        private String CLASSNAME="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        private String URL="jdbc:sqlserver://192.168.1.74:1433;databaseName=BDTemporal";
        
        private Connection con;
        
        public AccesoMSSQL(){
            
            try {
                Class.forName(CLASSNAME);
                con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
                
                
            } catch (ClassNotFoundException e) {  
                System.err.println(e.getMessage());
            }catch (SQLException esq) {  
                System.err.println(esq.getMessage());
            }
        
        }
        
        
        public Connection getConexion(){
        
        return con;
        }
        
       //prueba de conexion
        
//       public static void main(String[] args) {
//        AccesoMSSQL con=new AccesoMSSQL();
//    }
        
    
}
