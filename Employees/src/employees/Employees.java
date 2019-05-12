/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employees;

/**
 *
 * @author cansu.karaca
 */
public class Employees {

  private String name;
  private String surname;
  private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employees(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    public void inquireEmployeesInformation(){
         
        System.out.print("Information Employees");
        System.out.print("name" + name);
        System.out.print("surname" + surname);
        System.out.print("id" + id);
       
    } 
    
}
