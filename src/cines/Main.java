package cines;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        List<Genero> generos = new ArrayList<>();
            
        Genero gen1 = new Genero ("Drama");
        Genero gen2 = new Genero ("Suspenso");
        Genero gen3 = new Genero ("Terror");
        Genero gen4 = new Genero ("Comedia");
        
        generos.add(gen1);
        generos.add(gen2);
        generos.add(gen3);
        generos.add(gen4);
                  
        System.out.println(gen4.getNombre());
        
        Iterator <Genero> iter = generos.iterator();
        System.out.println("Generos: ");
        //mientas exista un elemento siguiente por recorrer
        while (iter.hasNext()){
            //obtenemos el Genero siendo recorrido
            Genero gen = iter.next();
            System.out.println(gen.getNombre());
        }
        
        Calificacion clas = new Calificacion ("Apta para todo publico");
        
        System.out.println(clas.getNombre());
        
        PaisDeOrigen pdo = new PaisDeOrigen ("ingles", "Estados Unidos");
        
        //Pelicula peli1 = new Pelicula("F8")
        
        //pdo.setIdioma("aleman");
        //pdo.setNombre("Alemania");
        
        System.out.println(pdo.getIdioma());
        System.out.println(pdo.getNombre());
        
    }
    
}