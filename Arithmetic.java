import java.util.Scanner;
public class Arithmetic{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	int number1;
	int number2;
	int sum;
	int difference;
	int product;
	int quotient;

	System.out.println("Enter the first number here: ");
	number1 = input.nextInt();

	System.out.println("Enter the second number here: ");
	number2 = input.nextInt();
	
	sum = number1 + number2;
	difference = number1 - number2;
	product = number1 * number2;
	quotient = number1 / number2;

	System.out.printf("sum is %d%n", sum);
	System.out.printf("difference is %d%n", difference);
	System.out.printf("product is %d%n", product);
	System.out.printf("quotient is %d%n", quotient);
}
}