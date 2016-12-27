/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.web.app.controllador;

import java.util.ArrayList;
import pe.web.app.include.Atraccion;
import pe.web.app.modelo.ModeloAtraccion;

/**
 *
 * @author soporte2
 */
public class ControladorAtracciones {
    
    
    
    
        public String getPanelView(){
        String htmlcode="";
            ModeloAtraccion mp=new ModeloAtraccion();
        ArrayList<Atraccion> atraccion=mp.getAllAtracciones();
        
        htmlcode+="<table border=\"1\">\n" +
"            <tr>\n" +
"                <th>CODIGO</th>\n" +
"                <th>ATRACCION</th>\n" +
"                <th>META</th>\n" +
"                <th>CANT. VISITAS</th>\n" +
"                <th>ESTADO</th>\n" +
"            </tr>\n";
        
        for (Atraccion p : atraccion) {
            htmlcode+="<tr>\n" +
"                <td id='id_producto'>"+p.getCod_atraccion()+"</td>\n" +
"                <td>"+p.getNombre()+"</td>\n" +
"                <td>"+p.getUmbrales()+"</td>\n" +
                 "<td>"+"Cantidad dia"+"</td>\n" +
"                <td>"+p.isEstado()+"</td>\n" +
"                <td><a id='btn-eliminar' href=\"\">Eliminar</a> <a href=\"\">Modificar</a></td>\n" +
"            </tr>\n";
        }
        htmlcode+= "</table>";
        
        
        
        return htmlcode;
    }
    
    
    
}
