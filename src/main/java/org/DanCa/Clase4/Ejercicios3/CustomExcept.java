package org.DanCa.Clase4.Ejercicios3;

public class CustomExcept extends RuntimeException{

    public CustomExcept(){
        super("No se pudo realizar la tarea deseada...");
    }

    /** Otra forma de definir un constructor de una excepción personalizada
         public CustomExcept(String message){
              super(message);
         }
     **/
}
