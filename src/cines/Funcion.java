package cines;

import java.util.Date;

public class Funcion {
    
    //atributos
    
    private int diaSemana;
    private int duracion;
    private Date horaInicio;
    private int numero;
    
    //metodo constructor (reserva memoria e inicializa las variables miembros
    //de la clase)
    
    public Funcion(int diaSemana, int duracion, Date horaInicio, int numero){
        this.diaSemana = diaSemana;
        this.duracion = duracion;
        this.horaInicio = horaInicio;
        this.numero = numero;
    }
    
    //metodos de seteo
    
    public int getDiaSemana(){
        return this.diaSemana;
    }
    
    public void setDiaSemana(int diaSemana){
        this.diaSemana = diaSemana;
    }
    
    public int getDuracion(){
        return this.duracion;
    }
    
    public void setDuracion(int duracion){
        this.duracion = duracion;
    }
    
    public Date getHoraInicio(){
        return this.horaInicio;
    }
    
    public void setHoraInicio(Date horaInicio){
        this.horaInicio = horaInicio;
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
}
