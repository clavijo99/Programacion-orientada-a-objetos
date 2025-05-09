/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples.herencia;

/**
 *
 * @author Gomez
 */
public class profesor extends persona{
    private String area;
    private String tipo_profesor;
    
    
    public profesor(String name, String last_name, int age, String gender, int id, String area, String tipo_profesor){
        super(name, last_name, age, gender, id);
        this.area = area;
        this.tipo_profesor = tipo_profesor;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getTipo_profesor() {
        return tipo_profesor;
    }

    public void setTipo_profesor(String tipo_profesor) {
        this.tipo_profesor = tipo_profesor;
    }

    @Override
    public String toString() {
        return "profesor{" + "area=" + area + ", tipo_profesor=" + tipo_profesor + '}';
    }
    
    
    
}
