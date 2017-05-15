package cines;

import java.util.Date;
//importacion de la clase BigDecimal para calculo decimal
import java.math.BigDecimal; 
import java.util.List;

public class Cine {
    
    //atributo
    
    private String direccion;
    private Date fechaInauguracion;
    private String nombre;
    private BigDecimal precioEntrada;
    private List<Sala> salas;
    private List<Programacion> programaciones;
    private List<HorarioFuncion> horariosFunciones;
    
    //metodo constructor
    
    public Cine(String direccion, Date fechaInauguracion, String nombre, BigDecimal precioEntrada){
        this.direccion = direccion;
        this.fechaInauguracion = fechaInauguracion;
        this.nombre = nombre;
        this.precioEntrada = precioEntrada;
    }
    
    //metodo constructor que incluye todos los atributos de la clase
    
    public Cine(String direccion, Date fechaInauguracion, String nombre, BigDecimal precioEntrada, List<Sala> salas, List<Programacion> programaciones, List<HorarioFuncion> horariosFunciones){
        this.direccion = direccion;
        this.fechaInauguracion = fechaInauguracion;
        this.nombre = nombre;
        this.precioEntrada = precioEntrada;
        this.salas = salas;
        this.programaciones = programaciones;
        this.horariosFunciones = horariosFunciones;
    }
    
    //metodos de seteo
    
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    
    public String getDireccion(){
        return this.direccion;
    }
    
    public void setFechaInauguracion(Date fechaInauguracion){
        this.fechaInauguracion = fechaInauguracion;
    }
    
    public Date getFechaInauguracion(){
        return this.fechaInauguracion;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setPrecioEntrada(BigDecimal precioEntrada){
        this.precioEntrada = precioEntrada;
    }
    
    public BigDecimal getPrecioEntrada(){
        return this.precioEntrada;
    }
    
    public void setSalas(List<Sala> salas){
        this.salas = salas;
    }
    
    public List<Sala> getSalas(){
        return this.salas;
    }
    
    public void setHorariosFunciones(List<HorarioFuncion> horariosFunciones){
        this.horariosFunciones = horariosFunciones;
    }
    
    public List<HorarioFuncion> getHorariosFunciones(){
        return this.horariosFunciones;
    }
    
    public void setProgramacion(List<Programacion> programaciones){
        this.programaciones = programaciones;
    }
    
    public List<Programacion> getProgramacion(){
        return this.programaciones;
    }
}
