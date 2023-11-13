package com.argentinaprograma4.Actividad4;

public class App {
    public static void main(String[] args) {
        
        Cancion cancion = new Cancion("The Scientist", "Coldplay", 2002, "A Rush of Blood to the head");
        CancionState enReproduccion = new CancionState(cancion);

        System.out.println("\nCaso de prueba 1 recien se lanza (popularidad normal)");
        enReproduccion.medirPopularidad();

        System.out.println("\nCaso de prueba 2 supera 1.000 reproducciones");
        enReproduccion.setReproducciones(1001);
        enReproduccion.medirPopularidad();
        
        System.out.println("\nCaso de prueba 3 baja del Auge por tener 5.000 dislikes o mas");
        enReproduccion.setDisLikes(50010);
        enReproduccion.medirPopularidad();

        System.out.println("\nCaso de prueba 4 es tendencia por superar 50.000 reproducciones y 20.000 likes");
        enReproduccion.setReproducciones(500001);
        enReproduccion.setLikes(20001);
        enReproduccion.medirPopularidad();

        System.out.println("\nCaso de prueba 5 es tendencia pero baja a normal por no ser reproducida por 24 hs");
        enReproduccion.setTiempoSinReproducir(24);
        enReproduccion.medirPopularidad();
    }
}
