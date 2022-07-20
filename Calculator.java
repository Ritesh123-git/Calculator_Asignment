package calculations;
import java.util.*;
public class Calculator {
	  static int num11=0;                             // declaring a variable static  num11 and num22 and initializing it with zero.
      static int num22=0;
     
 
      private void assign(int i, int j) {            // using the concept of access modifier to assign a value to num11 and num22; 
    		// TODO Auto-generated method stub
    		this.num11=i;
    		this.num22=j;                           // this keyword refer to the current class instance variable and assigning a value in it.
    	}
	 public static void main(String[] args)
	    {
	                                                  
	       
	        Calculator obj = new Calculator();        // Creating an object of the Calculations class
	                                                     // Take input from the user
	        obj.assign(0,0);
	        Scanner sc = new Scanner(System.in);
	  
	        System.out.println("Enter the numbers");
	  
	        
	        double num1=num11;                        //  performing the concept of implicit type casting
	        double num2=num22;
	        num1 = sc.nextDouble();
	  
	        num2 = sc.nextDouble();
	  
	        System.out.println("Enter the operator (+,-,*,/)");
	  
	        char operation = sc.next().charAt(0);
	        double result=0;
	        final double output ;                    // making the output variable final, so the final result must not be overrideen 
	  
	        switch (operation) {                     // Using the concept of control statement
	  
	        // case to add two numbers
	        case '+':
	  
	             output = num1 + num2;
	             result=output;
	  
	            break;
	  
	        // case to subtract two numbers
	        case '-':
	  
	            output = num1 - num2;
	            result=output;
	  
	            break;
	  
	        // case to multiply two numbers
	        case '*':
	  
	            output = num1 * num2;
	            result=output;
	  
	            break;
	  
	        // case to divide two numbers
	        case '/':
	  
	            output = num1 / num2;
	            result=output;
	  
	            break;
	  
	        default:
	  
	            System.out.println("You enter wrong input");
	  
	            break;
	        }
	  
	        System.out.println("The final result:");
	  
	        System.out.println();
	  
	        // print the final result
	        System.out.println(num1 + " " + operation + " " + num2
	                           + " = " + result);
	    }


	}