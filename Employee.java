
package test.java;


public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
   
 public Employee (int id,String firstName,String lastName,int salary ){
     
    this.id = id;
    this.firstName = firstName; 
    this.lastName = lastName; 
    this.salary = salary; 
 }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
   public String getname() {
        return name;
   }

    public void setName(String name) {
         this.name = name;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
     
    public int getAnuualSalary() {
     int anuualSalary = this.getSalary()* 12;
     
        return anuualSalary ;      
 
    }
     
   public int raiseSalary (int precent)  {
      int newSalary = this.getSalary() + (this.getSalary()* precent/100) ;
        return newSalary ;
       
   }
     
}
