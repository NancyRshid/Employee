
package test.java;

import java.util.Scanner;


public class NewClass1 {
     public static void main (String args[]){
     Scanner scanner = new Scanner(System.in) ;   
    int id = 0;
    String firstName = null;
    String lastName = null;
    int salary = 0;   
    
    System.out.println("Enter the id of this employee :");     
    id = scanner.nextInt();
    System.out.println("Enter the firstname of this employee :");          
    firstName = scanner.next();    
    System.out.println("Enter the lastname of this employee :");               
    lastName = scanner.next();     
    System.out.println("Enter the salary of this employee :");      
    salary = scanner.nextInt();   
    Employee sc = new Employee (id , firstName , lastName , salary)  ; 
  
 
    System.out.println( sc.getAnuualSalary());
     System.out.println( sc.raiseSalary(10));
    
    
         
         
         
         
         
         
         
         
         
     }
}
