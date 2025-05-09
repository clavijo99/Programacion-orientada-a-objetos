/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples.herencia;

/**
 *
 * @author Gomez
 */
public  abstract class persona {
    protected String name;
    protected String last_name;
    protected int age;
    protected  String gender;
    protected int id;

    public persona(String name, String last_name, int age, String gender, int id) {
        this.name = name;
        this.last_name = last_name;
        this.age = age;
        this.gender = gender;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getLast_name() {
        return last_name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setId(int id) {
        this.id = id;
    }

    // me permite mostrar la informacion cuando imprimo una instancia estudiante p = new estudiante(); system.out.print(p);
    @Override
    public String toString() {
        return "persona{" + "name=" + name + ", last_name=" + last_name + ", age=" + age + ", gender=" + gender + ", id=" + id + '}';
    }



    
    
    
    
    
    
    
}
