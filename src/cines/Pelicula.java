package cines;

import java.util.Date;
import java.util.List;

public class Pelicula {
    
    //atributos
    
    private int anioEstreno;
    private boolean disponible;
    private int duracion;
    private Date fechaIngreso;
    private String nombre;
    private String tituloOriginal;
    private PaisDeOrigen paisDeOrigen;
    private Genero genero;
    private Calificacion calificacion;
    private List<Funcion> funciones;
    
    //metodo constructor
    
    public Pelicula(int anioEstreno, boolean disponible, int duracion, String nombre, String tituloOriginal, PaisDeOrigen paisDeOrigen, Genero genero, Calificacion calificacion, List<Funcion> funciones){
        this.anioEstreno = anioEstreno;
        this.disponible = disponible;
        this.duracion = duracion;
        this.nombre = nombre;
        this.tituloOriginal = tituloOriginal;
        this.paisDeOrigen = paisDeOrigen;
        this.genero = genero;
        this.calificacion = calificacion;
        this.funciones = funciones;
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
    
    public PaisDeOrigen getPaisDeOrigen(){
        return this.paisDeOrigen;
    }
    
    public void setPaisDeOrigen(PaisDeOrigen paisDeOrigen){
        this.paisDeOrigen = paisDeOrigen;
    }
    
    public Genero getGenero(){
        return this.genero;
    }
    
    public void setGenero(Genero genero){
        this.genero = genero;
    }
    
    public Calificacion getCalificacion(){
        return this.calificacion;
    }
    
    public void setCalificacion(Calificacion calificacion){
        this.calificacion = calificacion;
    }
    
    public List<Funcion> getFunciones(){
        return this.funciones;
    }
    
    public void setFunciones(List<Funcion> funciones){
        this.funciones = funciones;
    }
}
