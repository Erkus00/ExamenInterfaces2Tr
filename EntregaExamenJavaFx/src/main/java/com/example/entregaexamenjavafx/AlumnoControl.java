package com.example.entregaexamenjavafx;

import com.example.entregaexamenjavafx.model.Alumno;

import java.util.ArrayList;

public class AlumnoControl {

    public ArrayList<Alumno> addAlumnos() {
        ArrayList<Alumno> listado_alumnos = new ArrayList<>();
        Alumno al1 = new Alumno(null, "Juan", "Viñuela", 4.5, 5.0, 7.3, 8.0, 7.4, 9.0, 1.5);
        Alumno al2 = new Alumno(null, "Benita", "Macande", 8.1, 4.0, 9.5, 8.0, 7.3, 8.0, 5.2);
        Alumno al3 = new Alumno(null, "Silvia", "Rama", 7.3, 8.3, 7.8, 8.0, 7.6, 9.0, 10.0);
        listado_alumnos.add(al1);
        listado_alumnos.add(al2);
        listado_alumnos.add(al3);
        return listado_alumnos;
    }
}
