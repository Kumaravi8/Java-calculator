
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		char operator;
		String choice;
		double num1,num2,result;
		System.out.println("\n************* WELCOME TO THE WORLD OF CALCULATION *************");
		while(true) {
			System.out.print("\nEnter First Number: ");
			num1=sc.nextDouble();
			System.out.print("\nEnter Second Number: ");
			num2=sc.nextDouble();
			System.out.println();
			System.out.println("Enter Operator (+, -, *, /): ");
			operator=sc.next().charAt(0);
			switch (operator) {
			case '+':
				result=num1+num2;
				System.out.println("Sum of "+num1+" and "+num2+" is: "+result);
				
				break;
				
		   case '-':
			   result=num1-num2;
				System.out.println("Subtraction of "+num1+" and "+num2+" is: "+result);
				break;
				
			case '*':
				result=num1*num2;
				System.out.println("Multiplication of "+num1+" and "+num2+" is: "+result);
                break;
                
            case '/':
            	if (num2==0) {
					System.out.println("Error: Cannot divided by Zero!");
				}
            	else {
					result=num1/num2;
					System.out.println("Division of "+num1+" and "+num2+" is: "+result);
				}
            	break;
			default:
				System.out.println("Invalid operator! use only (+, -, *, /)");
				break;
			}
			System.out.println("Do You Want to calculate again? (Yes/No)");
			choice=sc.next();
			if (choice.equalsIgnoreCase("No")) {
				System.out.println("You are leaving the world of calculation!! THANK YOU !!!");
				break;
			}
		}
		sc.close();
	}

}
