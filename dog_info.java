//Package declaration
package dog_information;

 //Class representing a Dog
 class Dog{
     //Instance variables
     String name ;
     String breed ;
     String colour ;
     int age ;
     
     //Method to display dog information
     public void mydog_info(){
         //Printing dog details using instance variables
         System.out.println("Following is my Dog Information");
         System.out.println("Name is : " +name);
         System.out.println("Breed is : " +breed);
         System.out.println("Colour is : " +colour);
         System.out.println("age is : " +age);
     }
}
//Main class
public class dog_info {
    //Main method
    public static void main(String[] args){
        //Creating object of Dog class
        //'d1' is referance variable
        //new Dog() creates object in heap memory
        Dog d1 = new Dog();
        //Assigning values to instance variables using dot operator
        d1.name = "Hachiko";
        d1.breed = "Husky";
        d1.colour = "Brown";
        d1.age = 12;
        //Calling method using object referance
        d1.mydog_info();
    }
}
