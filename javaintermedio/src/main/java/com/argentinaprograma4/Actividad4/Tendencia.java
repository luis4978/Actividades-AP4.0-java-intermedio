package com.argentinaprograma4.Actividad4;

/*
 * Clase que concreta el estado POPULARIDAD en Tendencia 
 */
public class Tendencia implements Popularidad{

    @Override
    public String mostrarPopularidad() {
        return "(FIRE)"+Icono.FIRE.texto()
        +this.cancion.getTitulo()+" - "
        +this.cancion.getArtista()
        +" ("+this.cancion.getAlbum()+" - "+this.cancion.getAnioAlbum()+")";
    }
    
}
