/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author Gomez
 */
public class perro extends animal{
    
    public perro(String name, String raza, String color, int n_patas, String genero ){
        // super le pertenece a mi clase padre
        super(name, raza, color, n_patas, genero);
    }

    @Override
    public void comer() {
        System.out.println("El perro come huesos");
    }

    @Override
    public void hablar() {
        System.out.println("El perro ladra");
    }
    
}
