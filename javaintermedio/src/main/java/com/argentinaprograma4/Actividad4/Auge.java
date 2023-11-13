package com.argentinaprograma4.Actividad4;

/*
 * Clase que concreta el estado POPULARIDAD en Auge
 */

public class Auge implements Popularidad{
    
    @Override
    public String mostrarPopularidad(Cancion cancion){
        return "(ROCKET) "
        +Icono.ROCKET.texto()+" "
        +cancion.getArtista()+" - "
        +cancion.getTitulo()
        +" ("+cancion.getAlbum()
        +" - "+cancion.getAnioAlbum()+")";
    }

    @Override
    public void medirPopularidad(CancionState enReproduccion) {
        if(esTendencia(enReproduccion)){
            enReproduccion.setPopularidad(new Tendencia());
        }else{
            if (esNormal(enReproduccion)) {
                enReproduccion.setPopularidad(new Normal());
            }
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
    private boolean esNormal(CancionState enReproduccion){
        Popularidad p = enReproduccion.getPopularidad();
            int disLikes = enReproduccion.getDisLikes();
            if(p instanceof Auge & disLikes > 5000){
                return true;
            }else{
                return false;
            }
    }
}
