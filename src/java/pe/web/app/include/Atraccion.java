
package pe.web.app.include;


public class Atraccion {
  
    private int cod_atraccion;
    private String nombre;
    private String descripcion;
//    private float precio;
//    private String categoria;
//    private String detalles;
//    private String reviews;
    private int umbrales;
    private boolean estado;
//    private String color;
//    private String img1;
//    private String img2;
//    private String img3;
//    private String img4;
//    private String img5;

public Atraccion(){
}

    public Atraccion(int cod_atraccion, String nombre, String descripcion, int umbrales, boolean estado) {
        this.cod_atraccion = cod_atraccion;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.umbrales = umbrales;
        this.estado = estado;
    }

    public int getCod_atraccion() {
        return cod_atraccion;
    }

    public void setCod_atraccion(int cod_atraccion) {
        this.cod_atraccion = cod_atraccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getUmbrales() {
        return umbrales;
    }

    public void setUmbrales(int umbrales) {
        this.umbrales = umbrales;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }


    
    
    
}
