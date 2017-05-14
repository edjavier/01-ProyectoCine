package cines;

import java.util.Date;

public class Programacion {
    
    //atributos
    
    private Date fechaFin;
    private Date fechaHoraCreada;
    private Date fechaInicio;
    
    //metodo constructor
    
    public Programacion(Date fechaFin, Date fechaHoraCreada, Date fechaInicio){
        this.fechaFin = fechaFin;
        this.fechaHoraCreada = fechaHoraCreada;
        this.fechaInicio = fechaInicio;
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
}
