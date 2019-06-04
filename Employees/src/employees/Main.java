
package employees;

import java.util.Scanner;


public class Main {
    
    public static void main(String[] args){
    
    Scanner scn = new Scanner(System.in);
    System.out.println("welcome to employees project");
    
    String operations = "1. operation for developers \n" +
                      "2. operation for TeamLead \n" + 
                      "exit for q \n"  ;
    System.out.println("*********************************");
    System.out.print(operations);
    while(true){
        System.out.println("Select your operation");
        String operation = scn.nextLine();
        
        if(operation.equals("q")){
            System.out.print("exit success ! good bye ");
            break;
        }
        else if (operation.equals("1")){
           Developer developer = new Developer("Cansu", "Karaca", 102, "Java,Pyhton");
           String developer_operation = "1. Format \n" 
                                      + "2. Show Information \n"
                                      + "exit for q";
           
           System.out.print(developer_operation);
           while (true){
               System.out.println("Select your developer operation");
               String dev_op=scn.nextLine();
               if (dev_op.equals("q")){
                       System.out.print("exit...");
                       break;       
               }
               else if(dev_op.equals("1")){
               System.out.println("Select your operation system");
               String opr=scn.nextLine();
               developer.format(opr); 
               }
               else if (dev_op.equals("2")){
               developer.inquireEmployeesInformation();
               }
               else {
               System.out.println("invalid operation");
               }
           
           }
        
        }
     else if (operation.equals("2")){
           TeamLead teamLead = new TeamLead("Mark" , "Denil" , 103, 15);
           String lead_operation = "1. Give a rise \n"
                                 + "2.Show information"
                                 + "exit for q ";
            System.out.print(lead_operation);
           while(true){
           System.out.println("Select your teamLead operation ");
           String lead_op=scn.nextLine();
           if(lead_op.equals("q")){
           System.out.print("exit...");
           break;
            }
           else if(lead_op.equals("1")){
           System.out.println("how much do you want to raise your teamlead ? ");
           int rise=scn.nextInt();
           teamLead.giveRaise(rise);
           }
           else if (lead_op.equals("2")){
           teamLead.inquireEmployeesInformation();
           }
           else{
           System.out.println("invalid operation");
           }       
           }   
        }
        
     else {
        
            System.out.println("invalid operation ");
        }
    
    
    }
    
  } 
}
