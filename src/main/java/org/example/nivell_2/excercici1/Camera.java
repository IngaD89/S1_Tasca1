package org.example.nivell_2.excercici1;

public interface Camera {

     default void fotografiar(){
        System.out.println("S’està fent una foto");
    }
}
