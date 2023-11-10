package com.argentinaprograma4.Actividad4;

/*
 * Clase que concreta el estado POPULARIDAD en Auge
 */
public class Auge implements Popularidad {
    
    @Override
    public String mostrarPopularidad(){
        return "(ROCKET)"+Icono.ROCKET.texto()
        +this.cancion.getArtista()+" - "
        +this.cancion.getTitulo()
        +" ("+this.cancion.getAlbum()+" - "+this.cancion.getAnioAlbum()+")";
    }
}
