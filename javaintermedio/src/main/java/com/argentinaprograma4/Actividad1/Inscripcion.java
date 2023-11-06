package com.argentinaprograma4.Actividad1;

import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Inscripcion {
    private HashMap<Integer,Alumno> listaAlum;
    private HashMap<Integer,Materia> listaMate;
    public Inscripcion(){
        listaAlum = new HashMap<>();
        listaMate = new HashMap<>();
    }

    public boolean aprobada(int materia, int dni){
        List<Integer> correlativas = listaMate.get(materia).getCorrelativas();
        List<Integer> aprobadas = listaAlum.get(dni).getMateriasAprobadas();

        boolean estaAprobada = false;
        for (Integer codCorrelativa : correlativas) {
            if (codCorrelativa != 0) {
                if(aprobadas.contains(codCorrelativa)){
                    estaAprobada = true;
                }else{
                    estaAprobada = false;
                }
            } else{
                estaAprobada = true;
            }                
        }
        return estaAprobada;
    }

    public void cargaAlumnos(Path archivo) throws IOException{
        Scanner lector = new Scanner(archivo);
        lector.useDelimiter("[;\\n]");
        while (lector.hasNextInt()) {
            int dni = lector.nextInt();
            String nom = lector.next();
            String ape = lector.next();
            Alumno alu = new Alumno(dni, nom, ape);
            listaAlum.put(alu.getLegajoDNI(), alu);
        }
        lector.close();

    }

    public void cargaMaterias(Path archi) throws IOException{
        Scanner lector = new Scanner(archi);
        lector.useDelimiter("[;\\n]");
        while (lector.hasNextInt()) {
            int cod = lector.nextInt();
            String mat = lector.next();
            Materia m = new Materia(cod, mat);
            listaMate.put(m.getCodigo(), m);
        }
        lector.close();
    }

    public void cargaAprobadas(Path archi) throws IOException{
        Scanner lector = new Scanner(archi);
        lector.useDelimiter("[;\\n]");
        while (lector.hasNextInt()) {
            int legajo =  lector.nextInt();
            int materia = lector.nextInt();
            listaAlum.get(legajo).getMateriasAprobadas().add(materia);
        }
        lector.close();   
    }

    public void cargaCorrelativas(Path archi) throws IOException{
        Scanner lector = new Scanner(archi);
        lector.useDelimiter("[;\\n]");

        while (lector.hasNextInt()) {
            int materia = lector.nextInt();
            int correlativa = lector.nextInt();
            listaMate.get(materia).getCorrelativas().add(correlativa);
        }
        lector.close();
    }

}
