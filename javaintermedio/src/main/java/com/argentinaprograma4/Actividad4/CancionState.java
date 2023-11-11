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

    public CancionState(Cancion cancion){
        this.cancion = cancion;
        this.reproducciones = 0;
        this.likes = 0;
        this.disLikes = 0;
        this.tiempoSinReproducir = 0;
        cancion.setPopularidad(new Normal());
    }

    public void setPopularidad (Popularidad popularidad){
        this.cancion.setPopularidad(popularidad);
    }
    public void medirPopularidad(){
        this.cancion.getPopularidad().medirPopularidad(this);
    }
}
