package employee.payroll.system;

public class Employee {
  // Private Variables(Encapsulation)
private String name;
private int ID;
private double salary;
private String Department;
// Method used to assign values to employee data 
public void Employee_info(String n , int id , double salary , String dep){
  //"this" refers to the current object variables
    this.name = n;
    this.ID = id;
    this.salary = salary;
    this.Department = dep;
}
  //Getter method to return employee name 
public String getName(){
    return name;
}
  //Getter method to return employee ID
public int getID(){
    return ID;
} 
  //Getter method to return employee salary
public double getSalary(){
    return salary;
} 
  //Getter method to return employee Department
public String getDept(){
    return Department;
} 
  // Method to display employee information 
public void display_Info(){
    System.out.println("Employee Name : " +name);
    System.out.println("Employee ID : " +ID);
    System.out.println("Salary is : " +salary);
    System.out.println("Department : " +Department);
}
  
public class EmployeePayrollSystem {
//Main method
    public static void main(String[] args) {
      //Creating an object of Employee class
        Employee emp = new Employee();
      //Calling the method to set employee information
        emp.Employee_info("Mike", 101, 745.80, "Computer Science");
        //Caling display method to print employee details 
        emp.display_Info();
    }
    
}
  
}
