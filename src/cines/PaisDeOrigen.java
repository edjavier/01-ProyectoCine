package cines;

public class PaisDeOrigen {
    
    //atributos
    
    private String idioma;
    private String nombre;
    
    //metodo constructor, contiene todos los atributos de la clase
    
    public PaisDeOrigen(String idioma, String nombre){
        this.idioma = idioma;
        this.nombre = nombre;
    }
    
    //metodos de seteo de cada atributo de la clase
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getIdioma(){ 
        return this.idioma;
    }
    
    public void setIdioma(String idioma){ 
        this.idioma = idioma;
    } 
}
