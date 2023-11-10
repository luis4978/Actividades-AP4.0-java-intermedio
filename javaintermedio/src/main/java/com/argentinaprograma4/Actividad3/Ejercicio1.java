package com.argentinaprograma4.Actividad3;

import java.util.List;
import java.util.stream.Collectors;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Ejercicio1 {
    
    public Ejercicio1 (){
    }
    public List<String> listaMayusculas(List<String> l){
        /*
         * Metodo que recibe una lista de Strings
         * .map(Function<? super T,? extends R> mapper) Es una interfaz funcional donde T 
         * es el tipo de dato de la colleccion original y R es el tipo de dato de la coleccion resultante,
         * mapper es la funcion que recibe por parametro..
         * map devuelve un stream con la coleccion resultante
         * .collect(Collectors.toList()) el metodo collect convierte el stream en una lista
         * pasandole por parametro el Collector que corresponda para la necesidad
         */
        return l.stream().map(nombre -> nombre.toUpperCase()).collect(Collectors.toList());
    }
}
