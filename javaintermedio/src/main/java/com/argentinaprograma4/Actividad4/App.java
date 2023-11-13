package com.argentinaprograma4.Actividad4;

public class App {
    public static void main(String[] args) {
        
        Cancion cancion = new Cancion("The Scientist", "Coldplay", 2002, "A Rush of Blood to the head");
        CancionState enReproduccion = new CancionState(cancion);

        //Caso de prueba 1 recien se lanza (popularidad normal)
        System.out.println("\nCaso de prueba 1 recien se lanza (popularidad normal)");
        Popularidad popularidad = enReproduccion.getCancion().getPopularidad();
        System.out.println(popularidad.mostrarPopularidad(enReproduccion.getCancion()));

        //Caso de prueba 2 supera 1.000 reproducciones
        System.out.println("\nCaso de prueba 2 supera 1.000 reproducciones");
        enReproduccion.setReproducciones(1001);
        enReproduccion.medirPopularidad();
        popularidad = enReproduccion.getCancion().getPopularidad();
        System.out.println(popularidad.mostrarPopularidad(enReproduccion.getCancion()));
        
        //Caso de prueba 3 baja del Auge por tener 5.000 dislikes o mas
        System.out.println("\nCaso de prueba 3 baja del Auge por tener 5.000 dislikes o mas");
        enReproduccion.setDisLikes(50010);
        enReproduccion.medirPopularidad();
        popularidad = enReproduccion.getCancion().getPopularidad();
        System.out.println(popularidad.mostrarPopularidad(enReproduccion.getCancion()));

        //Caso de preuba 4 es tendencia por superar 50.000 reproducciones y 20.000 likes
        System.out.println("\nCaso de preuba 4 es tendencia por superar 50.000 reproducciones y 20.000 likes");
        enReproduccion.setReproducciones(500001);
        enReproduccion.setLikes(20001);
        enReproduccion.medirPopularidad();
        popularidad = enReproduccion.getCancion().getPopularidad();
        System.out.println(popularidad.mostrarPopularidad(enReproduccion.getCancion()));

        //Caso de preuba 5 es tendencia pero baja a normal por no ser reproducida por 24 hs
        System.out.println("\nCaso de preuba 5 es tendencia pero baja a normal por no ser reproducida por 24 hs");
        enReproduccion.setTiempoSinReproducir(24);
        enReproduccion.medirPopularidad();
        popularidad = enReproduccion.getCancion().getPopularidad();
        System.out.println(popularidad.mostrarPopularidad(enReproduccion.getCancion()));
    }
}
