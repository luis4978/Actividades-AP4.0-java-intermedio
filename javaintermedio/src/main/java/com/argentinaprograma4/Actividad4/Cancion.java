package com.argentinaprograma4.Actividad4;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString

public class Cancion {
    private String titulo;
    private String artista;
    private int anioAlbum;
    private String album;

    public Cancion(String titulo, String artista, int anioAlbum, String album) {
        this.titulo = titulo;
        this.artista = artista;
        this.anioAlbum = anioAlbum;
        this.album = album;
    }

}
