package com.argentinaprograma4.Actividad1;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Materia {
    private int codigo;
    private String materia;
    private List<Integer> correlativas;

    public Materia(int cod, String mat){
        this.codigo = cod;
        this.materia = mat;
        this.correlativas = new ArrayList<>();
    }

    @Override
    public String toString(){
        return "Codigo: "+codigo+" Materia: "+materia+"\n"
            +"Correlativas: "+correlativas.toString();
    }

}
