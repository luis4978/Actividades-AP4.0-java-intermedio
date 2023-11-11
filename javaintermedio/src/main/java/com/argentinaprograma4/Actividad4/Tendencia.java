package com.argentinaprograma4.Actividad4;

/*
 * Clase que concreta el estado POPULARIDAD en Tendencia 
 */

public class Tendencia implements Popularidad{

    @Override
    public String mostrarPopularidad(Cancion cancion) {
        return "(FIRE)"+Icono.FIRE.texto()
        +cancion.getTitulo()+" - "
        +cancion.getArtista()
        +" ("+cancion.getAlbum()
        +" - "+cancion.getAnioAlbum()+")";
    }

    @Override
    public void medirPopularidad(CancionState cancionEnReproduccion) {
        if(esNormal(cancionEnReproduccion)){
            cancionEnReproduccion.getCancion().setPopularidad(new Normal());
        }
    }

    private boolean esNormal(CancionState cancionEnReproduccion){
        Popularidad p = cancionEnReproduccion.getCancion().getPopularidad();
        int horasSinReproducir = cancionEnReproduccion.getTiempoSinReproducir();
        if(p instanceof Tendencia & horasSinReproducir >= 24){
            return true;
        }else{
            return false;
        }
    }
    
}
