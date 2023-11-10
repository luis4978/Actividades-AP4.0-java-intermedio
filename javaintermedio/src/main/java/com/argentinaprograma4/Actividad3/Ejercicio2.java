package com.argentinaprograma4.Actividad3;

import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {
    public Ejercicio2(){

    }
    public String nCaracteres(List<String> lista, int carateres){
        return lista
        .stream()
        .filter(str -> str.length() > carateres)
        .collect(Collectors.joining(", ")); 
    }
}
