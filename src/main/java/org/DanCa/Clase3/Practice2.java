package org.DanCa.Clase3;

import java.util.ArrayList;
import java.util.List;

public class Practice2 {
    public static void main(String[] args) {
        class Persona {
            private String nombre;
            private String apellido;
            public Persona(String nombre, String apellido){
                this.nombre = nombre;
                this.apellido = apellido;
            }

            public String getNombre(){
                return nombre;
            }

            public String getApellido(){
                return apellido;
            }

            public void setNombre(String nombre){
                nombre = nombre;
            }

            public void setApellido(String apellido){
                apellido = apellido;
            }

            public void saludar(){
                System.out.println("¡Hola! ¿Como estan?");
            }
        }

        class Estudiante extends Persona {
            private String matricula;
            private Integer nota;
            private List<String> listaMaterias;

            public Estudiante(String matricula, Integer nota, List<String> listaMaterias, String nombre, String apellido){
                super(nombre, apellido);
                this.matricula = matricula;
                this.nota = nota;
                this.listaMaterias = listaMaterias;
            }

            public String getMatricula() {
                return matricula;
            }

            public void setMatricula(String matricula) {
                this.matricula = matricula;
            }

            public Integer getNota() {
                return nota;
            }

            public void setNota(Integer nota) {
                this.nota = nota;
            }

            public List<String> getListaMaterias() {
                return this.listaMaterias;
            }

            public void setListaMaterias(String materia) {
                this.listaMaterias.add(materia);
            }

            @Override
            public void saludar(){
                System.out.println("Que ondaaaa!!");
            }
        }

        class Profesor extends Persona {
            private List<Estudiante> listaAlumnos;
            public Profesor(List<Estudiante> listaAlumnos, String nombre, String apellido){
                super(nombre, apellido);
                this.listaAlumnos = listaAlumnos;
            }

            public List<Estudiante> getListaAlumnos() {
                return listaAlumnos;
            }

            public void setListaAlumnos(Estudiante estudiante) {
                this.listaAlumnos.add(estudiante);
            }

            @Override
            public void saludar(){
                System.out.println("Hola a todos!!");
            }

            public void calificar(Estudiante estudiante, Integer nota){
                estudiante.setNota(nota);
            }

            public void calificar(Integer nota){
                for(Estudiante e: listaAlumnos){
                    e.setNota(nota);
                }
            }

            /*
            public void calificar(Integer nota){
                for(int i = 0; i < alumnos.size(); i++){
                    Estudiante e = listaAlumnos.get(i);
                    e.setNota(nota);
                }
            }

             */
        }

        class NoDocente extends Persona {
            public NoDocente(String nombre, String apellido){
                super(nombre, apellido);
            }
            @Override
            public void saludar(){
                System.out.println("Buen dia!!");
            }
        }

    List<String> materia = new ArrayList<>();
    materia.add("Matematica");
    materia.add("Fisica");
    materia.add("Quimica");
    Estudiante e1 = new Estudiante("110110-2024", 9, materia, "Gimena", "Brizuela");
    Estudiante e2 = new Estudiante("110112-2024", 8, materia, "Paola", "Villarruel");
    Estudiante e3 = new Estudiante("110114-2024", 7, materia, "Jorge", "Ramirez");
    System.out.println(e1.getListaMaterias());

    List<Estudiante> estudiantes = new ArrayList<>();
    estudiantes.add(e1);
    estudiantes.add(e2);
    estudiantes.add(e3);

    Profesor p1 = new Profesor(estudiantes, "Aurelio", "Pietrabacca");

    NoDocente nd1 = new NoDocente("Pablo", "Gomez");

    List<Persona> personas = new ArrayList<>();
    personas.add(e1);
    personas.add(e2);
    personas.add(e3);
    personas.add(p1);
    personas.add(nd1);

    for(Persona p: personas){
        p.saludar();
    }
    }
}
