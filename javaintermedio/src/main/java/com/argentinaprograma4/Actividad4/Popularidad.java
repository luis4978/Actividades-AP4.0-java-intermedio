package com.argentinaprograma4.Actividad4;

/*
 * Clase utilizada para el ESTADO de popularidad del objeto cancion
 */
public interface Popularidad {
    String mostrarPopularidad(Cancion cancion);
    void medirPopularidad(CancionState cancionEnReproduccion);
} 
