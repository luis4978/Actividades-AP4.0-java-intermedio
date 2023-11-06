package com.argentinaprograma4.Actividad2;

import java.util.List;
import java.util.ArrayList;

public class TestConvertir{

    public TestConvertir(){

    }
    
    public List<String> listaConvertida(List<String> lista, Transforma transforma){
        List<String> listaMayusculas = new ArrayList<>();
        for (String str : lista) {
            listaMayusculas.add(transforma.transformar(str));
        }
        return listaMayusculas;
    }
}
