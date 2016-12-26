/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.web.app.modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import pe.web.app.bd.AccesoMSSQL;
import pe.web.app.include.Atraccion;
import java.util.Arrays;

/**
 *
 * @author soporte2
 */
public class ModeloAtraccion extends AccesoMSSQL{
    
    public ArrayList<Atraccion> getAllAtracciones(){
        
        ArrayList<Atraccion> atraccion=new ArrayList<>();
        PreparedStatement pst=null;
        ResultSet rs=null;
        
        try {
                String sql="CALL SelectAllAtracciones()";
                pst=getConexion().prepareCall(sql);
                rs=pst.executeQuery();
                while (rs.next()) {                
                atraccion.add(new  Atraccion(rs.getInt("CODIGO_ATRACC"), rs.getString("NOMBRE_ATRACC"), rs.getString("DESCRIPCION_ATRACC"),rs.getInt("UMBRAL"),rs.getBoolean("ESTADO")));
                    
            }
         
        } catch (Exception e) {
            
        }finally{
            try {
                if (getConexion()!=null) {
                getConexion().close();
            }
                if (pst !=null) {
                    pst.close();
                }
                if (rs !=null) {
                    rs.close();
                    
                }
            } catch (Exception e) {
            }
            
        }
      
        return atraccion;
        
    }
    
        public static void main(String[] args) {
        ModeloAtraccion mp=new ModeloAtraccion();
        for (Atraccion a : mp.getAllAtracciones()) {
            System.out.println(a.getNombre());
        }
        
    }
    
}


    
