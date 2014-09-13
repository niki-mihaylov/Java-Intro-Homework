import java.util.Scanner;

public class Sum_Two_Numbers {

	public static void main(String[] args) {
		System.out.print("Enter first integer: ");
		Scanner s = new Scanner(System.in);
		int firstNumber = s.nextInt();
		System.out.print("Enter second integer: ");
		int secondNumber = s.nextInt();
		
		System.out.printf("The sum of %d and %d is %d.", firstNumber, secondNumber, firstNumber + secondNumber );	
	}
}
