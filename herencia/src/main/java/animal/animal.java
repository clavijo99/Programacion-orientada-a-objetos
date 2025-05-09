/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author Gomez
 */
public abstract class animal {
    private String name;
    private String raza;
    private String color;
    private int n_patas;
    private String genero;

    public animal(String name, String raza, String color, int n_patas, String genero) {
        this.name = name;
        this.raza = raza;
        this.color = color;
        this.n_patas = n_patas;
        this.genero = genero;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getN_patas() {
        return n_patas;
    }

    public void setN_patas(int n_patas) {
        this.n_patas = n_patas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
    public abstract void comer();
    
    public abstract  void hablar();
    
    // el Ovverride me permite sobre escribir un metodo
    @Override
    public String toString() {
        return "animal{" + "name=" + name + ", raza=" + raza + ", color=" + color + ", n_patas=" + n_patas + ", genero=" + genero + '}';
    }
    
    
}
