/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author Gomez
 */
public class gato extends animal{
    
    public gato(String name, String raza, String color, int n_patas, String genero) {
        super(name, raza, color, n_patas, genero);
    }
    
    
    @Override
    public void comer(){
        System.out.println("El gato come ratones y purina"); 
    }
    
    @Override
    public void hablar(){
        System.out.println("El gato ronrronea");
    }
    
}
