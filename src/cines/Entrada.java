package cines;

import java.util.Date;
import java.math.BigDecimal;

public class Entrada {
    
    //atributos
    
    private Date fechaHoraFuncion;
    private Date fechaHoraVenta;
    private BigDecimal precioCobrado;
    private int ticketNro;
    private Funcion funcion;
    
    //metodo constructor
    
    public Entrada(Date fechaHoraFuncion, Date fechaHoraVenta, BigDecimal precioCobrado, int ticketNro, Funcion funcion){
        this.fechaHoraFuncion = fechaHoraFuncion;
        this.fechaHoraVenta = fechaHoraVenta;
        this.precioCobrado = precioCobrado;
        this.ticketNro = ticketNro;
        this.funcion = funcion;
    }
    
    //metodos de seteo
    
    public void setFechaHoraFuncion(Date fechaHoraFuncion){
        this.fechaHoraFuncion = fechaHoraFuncion;
    }
    
    public Date getFechaHoraFuncion(){
        return this.fechaHoraFuncion;
    }
    
    public void setFechaHoraVenta(Date fechaHoraVenta){
        this.fechaHoraVenta = fechaHoraVenta;
    }
    
    public Date getFechaHoraVenta(){
        return this.fechaHoraVenta;
    }
    
    public void setPrecioCobrado(BigDecimal precioCobrado){
        this.precioCobrado = precioCobrado;
    }
    
    public BigDecimal getPrecioCobrado(){
        return this.precioCobrado;
    }
    
    public void setTicketNro(int ticketNro){
        this.ticketNro = ticketNro;
    }
    
    public int getTicketNro(){
        return this.ticketNro;
    }
    
    public void setFuncion(Funcion funcion){
        this.funcion = funcion;
    }
    
    public Funcion getFuncion(){
        return this.funcion;
}
}