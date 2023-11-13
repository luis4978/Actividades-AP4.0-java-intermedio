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
    public void medirPopularidad(CancionState cancionEnReproduccion) {
        if(esTendencia(cancionEnReproduccion)){
            cancionEnReproduccion.getCancion().setPopularidad(new Tendencia());
        }else{
            if (esNormal(cancionEnReproduccion)) {
                cancionEnReproduccion.getCancion().setPopularidad(new Normal());
            }
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
    private boolean esNormal(CancionState cancionEnReproduccion){
        Popularidad p = cancionEnReproduccion.getCancion().getPopularidad();
            int disLikes = cancionEnReproduccion.getDisLikes();
            if(p instanceof Auge & disLikes > 5000){
                return true;
            }else{
                return false;
            }
    }
}
