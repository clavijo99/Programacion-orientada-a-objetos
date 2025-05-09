/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples.herencia;

/**
 *
 * @author Gomez
 */
public class estudiante extends persona {
    private String semestre;
    
    public estudiante(String name, String last_name, int age, String gender, int id, String semestre){
        super(name, last_name, age, gender, id);
        this.semestre = semestre;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return "estudiante{" + "semestre=" + semestre + '}' + "Nombre" + this.name + "apellido" + this.last_name;
    }
    
    
    
}
