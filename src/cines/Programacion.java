package cines;

import java.util.Date;
import java.util.List;

public class Programacion {
    
    //atributos
    
    private Date fechaFin;
    private Date fechaHoraCreada;
    private Date fechaInicio;
    private List<Funcion> funciones;
    
    //metodo constructor
    
    public Programacion(Date fechaFin, Date fechaHoraCreada, Date fechaInicio){
        this.fechaFin = fechaFin;
        this.fechaHoraCreada = fechaHoraCreada;
        this.fechaInicio = fechaInicio;
    }
    
    //metodo constructor que incluye todos los atributos de la clase
    
    public Programacion(Date fechaFin, Date fechaHoraCreada, Date fechaInicio, List<Funcion> funciones){
        this.fechaFin = fechaFin;
        this.fechaHoraCreada = fechaHoraCreada;
        this.fechaInicio = fechaInicio;
        this.funciones = funciones;
    }
    
    //metodos de seteo
    
    public void setFechaFin(Date fechaFin){
        this.fechaFin = fechaFin;
    }
    
    public Date getFechaFin(){
        return this.fechaFin;
    }
    
    public void setFechaHoraCreada(Date fechaHoraCreada){
        this.fechaHoraCreada = fechaHoraCreada;
    }
    
    public Date getFechaHoraCreada(){
        return fechaHoraCreada;
    }
    
    public void setFechaInicio(Date fechaInicio){
        this.fechaInicio = fechaInicio;
    }
    
    public Date getFechaInicio(){
        return fechaInicio;
    }
    
    public void setFunciones(List<Funcion> funciones){
        this.funciones = funciones;
    }
    
    public List<Funcion> getFunciones(){
        return this.funciones;
    }
}
