package calculator;

	import java.util.Scanner;

	public class Cal {
		
		public double addition(double num1 , double num2) {
			return num1 + num2;
		}
		
		public double subtraction(double num1 , double num2) {
			return num1 - num2;
		}
		public double product(double num1 , double num2) {
			return num1 * num2;
		}
		public double divide(double num1 , double num2) {
			return num1 / num2;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			Cal obj = new Cal();
			System.out.println("Calculator\n1. Addition\n2. Subtraction\n3. Product\n4. Divide\nEnter operation: ");
			int choice = sc.nextInt();
			System.out.println("Enter two numbers");
			double num1 = sc.nextDouble(),num2 = sc.nextDouble(); 
			switch (choice) {
			case 1:
				System.out.println("Sum: "+obj.addition(num1, num2));
				break;
			case 2:
				System.out.println("Difference: "+obj.subtraction(num1, num2));
				break;
			case 3:
				System.out.println("Product: "+obj.product(num1, num2));
				break;
			case 4:
				System.out.println("Quotient: "+obj.divide(num1, num2));
				break;
			default:
				System.out.print("Invalid Input\n");
			}
		}

	}

