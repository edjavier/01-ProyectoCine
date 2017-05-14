package cines;

public class Genero {
    
    //atributos
    
    private String nombre;
    
    //metodo constructor, incluye todos los atributos de la clase

    public Genero(String nombre){
        this.nombre = nombre;
    }
    
    //metodos de seteo de cada atributo de la clase

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }   
}