package cines;

import java.util.Date;

public class Pelicula {
    
    //atributos
    
    private int anioEstreno;
    private boolean disponible;
    private int duracion;
    private Date fechaIngreso;
    private String nombre;
    private String tituloOriginal;
    
    //metoo constructor
    
    public Pelicula(int anioEstreno, boolean disponible, int duracion, String nombre, String tituloOriginal){
        this.anioEstreno = anioEstreno;
        this.disponible = disponible;
        this.duracion = duracion;
        this.nombre = nombre;
        this.tituloOriginal = tituloOriginal;
    }
    
    //metodos de seteo de cada atributo de la clase
    
    public int getAnioEstreno(){
        return this.anioEstreno;
    }
    
    public void setAnioEstreno(int anioEstreno){
        this.anioEstreno = anioEstreno;
    }
    
    public boolean getDisponible(){
        return this.disponible;
    }
    
    public void setDisponible(boolean disponible){
        this.disponible = disponible;
    }
    
    public int getDuracion(){
        return this.duracion;
    }
    
    public void setDuracion(int duracion){
        this.duracion = duracion;
    }
    
    public Date getFechaIngreso(){
        return this.fechaIngreso;
    }
    
    public void getFechaIngreso(Date fechaIngreso){
        this.fechaIngreso = fechaIngreso;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getTituloOriginal(){
        return this.tituloOriginal;
    }
    
    public void setTituloOriginal(String tituloOriginal){
        this.tituloOriginal = tituloOriginal;
    }
}