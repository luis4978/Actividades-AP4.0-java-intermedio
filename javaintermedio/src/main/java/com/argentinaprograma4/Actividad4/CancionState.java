package com.argentinaprograma4.Actividad4;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class CancionState {//Contexto
    private Cancion cancion;
    private Popularidad popularidad;
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
        this.popularidad = new Normal();
    }
    public void medirPopularidad(){
        this.popularidad.medirPopularidad(this);
        System.out.println(this.popularidad.mostrarPopularidad(this.cancion));
    }
}
