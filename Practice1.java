
package practice1;
import java.util.Scanner;

public class Practice1 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int num1, num2;
        int sum, difference, product, quotient;
        
        
        System.out.println("A Simple Calculator");
        
        System.out.println("Choose the operator to be used:");
        
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        
        System.out.print("Your choice:");
        int resp = input.nextInt();
        
        if (resp == 1){
            
            System.out.print("Enter first number:");
            num1 = input.nextInt();
            System.out.print("Enter second number:");
            num2 = input.nextInt();
            
            sum = num1 + num2;
            
            System.out.println("The sum of " + num1 +  " and " + num2 + " is: " + sum);
        }else if(resp == 2){
            System.out.print("Enter first number:");
            num1 = input.nextInt();
            System.out.print("Enter second number:");
            num2 = input.nextInt();
            
            difference = num1 - num2;
            
            System.out.println("The difference of " + num1 +  " and " + num2 + " is: " + difference);
        } else if(resp == 3){
            System.out.print("Enter first number:");
            num1 = input.nextInt();
            System.out.print("Enter second number:");
            num2 = input.nextInt();
            
            product = num1 * num2;
            
            System.out.println("The procduct of " + num1 +  " and " + num2 + " is: " + product);
        } else if(resp == 4){
            System.out.print("Enter first number:");
            num1 = input.nextInt();
            System.out.print("Enter second number:");
            num2 = input.nextInt();
            
            quotient = num1 / num2;
            
            System.out.println("The quotient of " + num1 +  " and " + num2 + " is: " + quotient);
        
        }else{
            System.out.print("INVALID INPUT!");
        }
        
        
    
}
}
