package com.argentinaprograma4.Actividad4;

/*
 * Clase que concreta el estado POPULARIDAD en Tendencia 
 */

public class Tendencia implements Popularidad{

    @Override
    public String mostrarPopularidad(Cancion cancion) {
        return "(FIRE) "
        +Icono.FIRE.texto()+" "
        +cancion.getTitulo()+" - "
        +cancion.getArtista()
        +" ("+cancion.getAlbum()
        +" - "+cancion.getAnioAlbum()+")";
    }

    @Override
    public void medirPopularidad(CancionState enReproduccion) {
        if(esNormal(enReproduccion)){
            enReproduccion.setPopularidad(new Normal());
        }
    }

    private boolean esNormal(CancionState enReproduccion){
        Popularidad p = enReproduccion.getPopularidad();
        int horasSinReproducir = enReproduccion.getTiempoSinReproducir();
        if(p instanceof Tendencia & horasSinReproducir >= 24){
            return true;
        }else{
            return false;
        }
    }
    
}
