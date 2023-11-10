package com.argentinaprograma4.Actividad4;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class CancionState {//Contexto
    private Cancion cancion;
    private int reproducciones;
    private int likes;
    private int disLikes;
    private int tiempoSinReproducir;

    public void setPopularidad (Popularidad popularidad){
        this.cancion.setPopularidad(popularidad);
    }
    
    public void medirPopularidad(){
        if(reproducciones > 1000 & disLikes < 5000){
            cancion.setPopularidad(new Auge());
        }else{
            cancion.setPopularidad(new Normal());
        }
        
    }
}
