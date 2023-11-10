package com.argentinaprograma4.Actividad4;


/*
 * Clase que concreta el estado POPULARIDAD en Normal
 */
public class Normal implements Popularidad {

    @Override
    public String mostrarPopularidad() {
        return "(MUSICAL NOTE) "+Icono.MUSICAL_NOTE.texto()
        +this.cancion.getArtista()+" - "
        +this.cancion.getAlbum()+" - "
        +this.cancion.getTitulo();
    }
    
}
