/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package examples.herencia;

/**
 *
 * @author Gomez
 */
public class Herencia {

    public static void main(String[] args) {
        estudiante e = new estudiante("juan", "perez", 25, "Masculino", 1 , "2");
        profesor p = new profesor("pedro", "velez", 30, "Masculino", 2, "Ingeneria", "Tiempo completo");
        
        System.out.println(e);
        System.out.println(p);
    }
}
