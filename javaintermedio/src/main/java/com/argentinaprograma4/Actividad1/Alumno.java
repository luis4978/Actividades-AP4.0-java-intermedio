package com.argentinaprograma4.Actividad1;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Alumno {
    private int legajoDNI;
    private String nombre;
    private String apellido;
    private List<Integer> materiasAprobadas;

    public Alumno(int dni, String nom, String ape){
        legajoDNI = dni;
        nombre = nom;
        apellido = ape;
        materiasAprobadas = new ArrayList<>();
    }
    @Override
    public String toString(){
        return " Legajo: "+legajoDNI+" Nombre: "+nombre+" "+apellido+"\n "+"Materias aprobadas"+materiasAprobadas.toString();
    }
}
