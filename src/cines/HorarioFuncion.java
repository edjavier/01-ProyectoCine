package cines;

import java.util.Date;

public class HorarioFuncion {
    
    //atributos
    
    private int diaDeSemana;
    private int duracionIntervalo;
    private int duracionPublicidad;
    private boolean esTrasnoche;
    private Date horaPrimeraFuncion;
    private Date horaUltimaFuncion;
    
    //metodo constructor (reserva memoria e inicializa las variables
    //miembros de la clase)
    
    public HorarioFuncion(int diaDeSemana, int duracionIntervalo, int duracionPublicidad, boolean esTrasnoche, Date horaPrimeraFuncion, Date horaUltimaFuncion){
        this.diaDeSemana = diaDeSemana;
        this.duracionIntervalo = duracionIntervalo;
        this.duracionPublicidad = duracionPublicidad;
        this.esTrasnoche = esTrasnoche;
        this.horaPrimeraFuncion = horaPrimeraFuncion;
        this.horaUltimaFuncion = horaUltimaFuncion;       
    }
    
    //metodos de seteo
    
    public void setDiaDeSemana(int diaDeSemana){
        this.diaDeSemana = diaDeSemana;
    }
    
    public int getDiaDeSemana(){
        return this.diaDeSemana;
    }
    
    public void setDuracionIntervalo(int duracionIntervalo){
        this.duracionIntervalo = duracionIntervalo;
    }
    
    public int getDuracionIntervalo(){
        return this.duracionIntervalo;
    }
    
    public void setDuracionPublicidad(int duracionPublicidad){
        this.duracionPublicidad = duracionPublicidad;
    }
    
    public int getDuracionPublicidad(){
        return this.duracionPublicidad;
    }
    
    public void setEsTrasnoche(boolean esTrasnoche){
        this.esTrasnoche = esTrasnoche;
    }
    
    public boolean getEsTrasnoche(){
        return this.esTrasnoche;
    }
    
    public void setHoraPrimeraFuncion(Date horaPrimeraFuncion){
        this.horaPrimeraFuncion = horaPrimeraFuncion;
    }
    
    public Date getHoraPrimeraFuncion(Date horaPrimeraFuncion){
        return this.horaPrimeraFuncion;
    }
    
    public void setHoraUltimaFuncion(Date horaUltimaFuncion){
        this.horaUltimaFuncion = horaUltimaFuncion;
    }
    
    public Date getHoraUltimaFuncion(){
        return this.horaUltimaFuncion;
    }   
}
