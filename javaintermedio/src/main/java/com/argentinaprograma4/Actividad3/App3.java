package com.argentinaprograma4.Actividad3;

import java.util.ArrayList;
import java.util.List;


public class App3 {
    public static void main(String[] args) {
        
        List<String> listaNombres = new ArrayList<>();
        listaNombres.add("noelia");
        listaNombres.add("lorena");
        listaNombres.add("luis");
        listaNombres.add("amalia");
        
        Ejercicio1 ej1 = new Ejercicio1();
        List<String> listaNombresMayusculas = ej1.listaMayusculas(listaNombres);
        listaNombresMayusculas.stream().forEach(nombre -> System.out.println(nombre));

        Ejercicio2 ej2 = new Ejercicio2();
        int caracteres = 4;
        System.out.println(ej2.nCaracteres(listaNombres, caracteres));
        System.out.println(ej2.nCaracteres(ej1.listaMayusculas(listaNombres), caracteres));
        

    }
}
