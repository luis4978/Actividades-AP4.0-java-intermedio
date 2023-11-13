package com.argentinaprograma4.Actividad4;

/*
 * Clase que concreta el estado POPULARIDAD en Normal
 */

public class Normal implements Popularidad {

    @Override
    public String mostrarPopularidad(Cancion cancion) {
        return "(MUSICAL NOTE) "
        +Icono.MUSICAL_NOTE.texto()+" "
        +cancion.getArtista()+" - "
        +cancion.getAlbum()+" - "
        +cancion.getTitulo();
    }

    @Override
    public void medirPopularidad(CancionState enReproduccion) {
        if (esAuge(enReproduccion)) {
            enReproduccion.setPopularidad(new Auge());
        }
        if (esTendencia(enReproduccion)) {
            enReproduccion.setPopularidad(new Tendencia());
        }        
    }

    private boolean esAuge(CancionState enReproduccion){
        int reproducciones = enReproduccion.getReproducciones();
        if(reproducciones > 1000){
            return true;
        } else {
            return false;
        }
    }
    private boolean esTendencia(CancionState enReproduccion){
        Popularidad p = enReproduccion.getPopularidad();
        int reproducciones = enReproduccion.getReproducciones();
        int likes = enReproduccion.getLikes();
        
        if(p instanceof Auge & reproducciones > 50000 & likes > 20000){
            return true;
        }else{
            return false;
        }
    }
    
}
