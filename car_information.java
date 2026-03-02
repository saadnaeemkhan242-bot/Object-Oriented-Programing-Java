import java.util.Scanner;
// Class definition
 class Car_info {
     //private Instance variables
 private String name;
 private String company_name;
 private int model_year;
 //setter method to set car name
 public void setName(String name){
     //Assign parameter value to instance variable 
     this.name = name;
 }   //setter method to set company name
 public void setCo_name(String company_name){
     this.company_name = company_name;
 }
 //setter method to set model year with validation
 public void setMo_year(int model_year){
     //validiation condition
     if (model_year > 2000 && model_year < 2027){
         //if valid, assign value
         this.model_year = model_year;
     }
     else{
         //if invalid, show message
         System.out.println(model_year + " is out of stock! ");
         //set default value 0 (means invalid)
     this.model_year = 0;
     }
 }
 //Getter method to return car name
 public String getName(){
     return name;
 }
 //Getter method to return company name
 public String getCo_name(){
     return company_name;
 }
 //Getter method to eturn model year
 public int getMo_year(){
     return model_year;
 }
 //Method to display car details
 public void displayDetails(){
     //Only display if model year is valid
     if(model_year !=0 ){
     System.out.println("Car Name is : " +name);
            System.out.println("Company Name is : " +company_name);
            System.out.println("Model Year is : " +model_year);
 }
     else
         System.out.println("Car details cannot be displayed due to invalid model year.");
 }
}
 
//Main class
public class Main{
    public static void main(String[] args){
        //Create scanner object for input
        try(Scanner sc = new Scanner(System.in)){
            //Create object for car_info class
            Car_info c1 = new Car_info();
            //Taking iput from user
            System.out.println("Enter Car Name :");
            String name = sc.nextLine();
            System.out.println("Enter Company Name :");
            String co_name = sc.nextLine();
            System.out.println("Enter Model Year :");
            int model_year = sc.nextInt();
            //Setting values using setter methods
            c1.setName(name);
            c1.setCo_name(co_name);
            c1.setMo_year(model_year);
            //Display details usng method
            c1.displayDetails();
        }
    }
}
