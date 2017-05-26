package cines;

import java.util.Date;
import java.util.List;

public class Funcion {
    
    //atributos
    
    private int diaSemana;
    private int duracion;
    private Date horaInicio;
    private int numero;
    private Pelicula pelicula;
    private Sala sala;
    private List<Entrada> entradas;
    
    //metodo constructor (reserva memoria e inicializa las variables miembros
    //de la clase)
    
    public Funcion(int diaSemana, int duracion, Date horaInicio, int numero, Pelicula pelicula, Sala sala, List<Entrada> entradas){
        this.diaSemana = diaSemana;
        this.duracion = duracion;
        this.horaInicio = horaInicio;
        this.numero = numero;
        this.pelicula = pelicula;
        this.sala = sala;
        this.entradas = entradas;
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
    
    public Pelicula getPelicula(){
        return this.pelicula;
    }
    
    public void setPeliculas (Pelicula pelicula){
        this.pelicula = pelicula;
    }
    
    public Sala getSala(){
        return this.sala;
    }
    
    public void setSala(Sala sala){
        this.sala = sala;
    }
    
    public List<Entrada> getEntradas(){
        return this.entradas;
    }
    
    public void setEntradas(List<Entrada> entradas){
        this.entradas = entradas;
    }
}
