package com.argentinaprograma4.Actividad2;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        
        List<String> listaMayusculas = new ArrayList<>();
        List<String> listaMinusculas = new ArrayList<>();
        listaMinusculas.add("noelia");
        listaMinusculas.add("lorena");
        listaMinusculas.add("luis");
        listaMinusculas.add("amalia");

        
        Transforma aMayuscula = (String str) -> {
            return str.toUpperCase();
        }; 
        TestConvertir test = new TestConvertir();
        listaMayusculas = test.listaConvertida(listaMinusculas, aMayuscula);
        
        System.out.println("Lista minusculas: ");
        for (String str : listaMinusculas) {
            System.out.println(str);
        }
        
        System.out.println("Lista mayusculas: ");
        for (String str : listaMayusculas) {
            System.out.println(str);
        }
    }
}
