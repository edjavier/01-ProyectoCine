package cines;

public class Sala {
    
    //atributos
    
    private int capacidad;
    private int numero;
    
    //metodo constructor
    
    public Sala(int capacidad, int numero){
        this.capacidad = capacidad;
        this.numero = numero;
}
    
    //metodos de seteo de cada atributo de la clase
    
    public int getCapacidad(){
        return this.capacidad;
    }
    
    public void setCapacidad(int capacidad){
        this.capacidad = capacidad;
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
}
