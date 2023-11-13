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
    public void medirPopularidad(CancionState cancionEnReproduccion) {
        if (esAuge(cancionEnReproduccion)) {
            cancionEnReproduccion.setPopularidad(new Auge());
        }
        if (esTendencia(cancionEnReproduccion)) {
            cancionEnReproduccion.setPopularidad(new Tendencia());
        }
    }

    private boolean esAuge(CancionState cancionEnReproduccion){
        int reproducciones = cancionEnReproduccion.getReproducciones();
        if(reproducciones > 1000){
            return true;
        } else {
            return false;
        }
    }
    private boolean esTendencia(CancionState cancionEnReproduccion){
        Popularidad p = cancionEnReproduccion.getCancion().getPopularidad();
        int reproducciones = cancionEnReproduccion.getReproducciones();
        int likes = cancionEnReproduccion.getLikes();
        
        if(p instanceof Auge & reproducciones > 50000 & likes > 20000){
            return true;
        }else{
            return false;
        }
    }
    
}
