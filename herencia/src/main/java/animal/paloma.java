/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author Gomez
 */
public class paloma extends animal{
    
    private int n_alas;
    
    
    public paloma(String name, String raza, String color, int n_patas, String genero, int n_alas) {
        super(name, raza, color, n_patas, genero);
        this.n_alas = n_alas;
    }

    public int getN_alas() {
        return n_alas;
    }

    public void setN_alas(int n_alas) {
        this.n_alas = n_alas;
    }
    
    
    @Override
    public void comer(){
        System.out.println("La paloma come maizs");
        
    }

    @Override
    public void hablar() {
        System.out.println("La paloma arrulla");
    }
    
    
}
