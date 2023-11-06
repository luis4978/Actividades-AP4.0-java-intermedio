package com.argentinaprograma4.Actividad1;

import java.nio.file.Paths;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Path;

public class App {
    public static void main(String[] args) throws IOException {
        
        Path archiAlu = Paths.get("javaintermedio\\Alumnos.csv");
        Path archiMate = Paths.get("javaintermedio\\Materias.csv");
        Path archiAprobadas = Paths.get("javaintermedio\\listaAprobados.txt");
        Path archiCorrelativas = Paths.get("javaintermedio\\listaCorrelativas.txt");
        Scanner sc = new Scanner(System.in);

        Inscripcion inscripcion = new Inscripcion();
        inscripcion.cargaAlumnos(archiAlu);
        inscripcion.cargaMaterias(archiMate);
        inscripcion.cargaAprobadas(archiAprobadas);
        inscripcion.cargaCorrelativas(archiCorrelativas);

        for (Materia m : inscripcion.getListaMate().values()) {
            System.out.println(m.toString());
        }
        System.out.println("Ingrese el codigo de la materia a inscribir:");
        int materia = sc.nextInt();
        
        System.out.println("Ingrese DNI del alumno:");
        int dni = sc.nextInt();

        System.out.println("Materias aprobadas "+inscripcion.getListaAlum().get(dni).getMateriasAprobadas().toString());
        String nomMateria = inscripcion.getListaMate().get(materia).getMateria();
        boolean inscripcionAprobada = inscripcion.aprobada(materia, dni);

        if (inscripcionAprobada) {
            System.out.println("Se puede inscribir en la materia "+nomMateria);
        } else{
            System.out.println("No se puede inscribir ");
        }

        /* 
        for (Alumno a : inscripcion.getListaAlum().values()) {
            System.out.println(a.toString());
        }
        */
    }
}
