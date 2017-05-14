package cines;

import java.util.Date;
//importacion de la clase BigDecimal para calculo decimal
import java.math.BigDecimal; 

public class Cine {
    
    //atributo
    
    private String direccion;
    private Date fechaInauguracion;
    private String nombre;
    private BigDecimal precioEntrada;
    
    //metodo constructor
    
    public Cine(String direccion, Date fechaInauguracion, String nombre, BigDecimal precioEntrada){
        this.direccion = direccion;
        this.fechaInauguracion = fechaInauguracion;
        this.nombre = nombre;
        this.precioEntrada = precioEntrada;
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
}
