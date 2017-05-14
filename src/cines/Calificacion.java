package cines;

public class Calificacion {

    //atributos
    
    private String nombre;
    
    //metodo constructor, contiene todos los atributos de la clase
    
    public Calificacion (String nombre){     
        this.nombre = nombre;    
    }
    
    //metodos de seteo de cada atributo de la clase
    
    public String getNombre (){     
        return this.nombre;
    }
    
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
}
