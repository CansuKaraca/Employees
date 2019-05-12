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
public class TeamLead extends Employees{
    
    private int dept_person_count;

    public TeamLead(String name, String surname, int id, int dept_person_count) {
        super(name, surname, id);
        this.dept_person_count=dept_person_count;
    }

    @Override
    public void inquireEmployeesInformation() {
        super.inquireEmployeesInformation(); //To change body of generated methods, choose Tools | Templates.
        System.out.print("Team Lead managed employees " + dept_person_count);
    }
    
    public void giveRaise(int rise){
    
    System.out.print(getName() + "salary raise" + rise + "...");
    }    
    
    
}
