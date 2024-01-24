package org.DanCa.Clase3;


public class Practice1 {
    public static void main(String[] args) {
        class Estudiante {
            private Integer id;
            private String nombreCompleto;
            private Float promedio;

            public Estudiante(Integer id, String nombreCompleto, Float promedio){
                this.id = id;
                this.nombreCompleto = nombreCompleto;
                this.promedio = promedio;
            }

            public Integer getId(){
                return this.id;
            }

            public void setId(Integer id){
                this.id = id;
            }

            public void retrieveInfo(){
                if(this.id != 0){
                    System.out.println("ID: " + this.id + "\nNombre: " + this.nombreCompleto + "\nPromedio: " + this.promedio);
                }
            }
        }

        Estudiante e1 = new Estudiante(110100, "Gimena Brizuela", 8.88f);
        e1.retrieveInfo();

    }
}
