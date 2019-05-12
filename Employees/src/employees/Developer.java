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
public class Developer  extends Employees{
    
    private String program_language;
    
    public Developer(String name,String surname, int id,String program_language ){
        super(name,surname,id);
        this.program_language=program_language; 
    }
    
    public void format(String operating_system){
    
        System.out.print(getName() + "" + operating_system + "loading" );
    }

    @Override
    public void inquireEmployeesInformation() {
        super.inquireEmployeesInformation(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Program language" + program_language);
    }
    
}
