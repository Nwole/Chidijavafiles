import java.util.Scanner;
public class Smalles{
	public static void main(String[] args){
	Scanner = new Scanner(System.in);
	
	int number1;
	int number2;
	int number3;
	int sum;
	int average;
	int product;
	int smallest;
	int largest;

	System.out.println("Enter the first number:");
	number1 = input.nextInt();
	System.out.println("Enter the second number:");
	number2 = input.nextInt();
	System.out.println("Enter the third number:");
	number3 = input.nextInt();	

	if(number1 > number2 & number1 > number3 ){
	System.out.printf("Largest is %d%n",number1 );
	}

	else if (number2 > number1 & number2 > number3 ){
	System.out.printf("Largest is %d%n:", number2);
	}

	else{
	System.out.printf("Largest is %d%n:", number3);
	}
	if(number3 < number1 & number2 < number3){
	System.out.printf("Smallest is %d%n", number1);
	}
	else if (number1 < number2 & number2 < number3){
	System.out.printf("Smallest is %d%n", number3);
	}

	else{
	System.out.printf("Smallest is %d%n", number3);
	}

	int sum = number1 + number2 + number3;
	int average = (number1 + number2 + number3);
	int product = number1 * number2 * number3;


	System.out.printf("sum output of input are %d%n:",sum);

	System.out.printf("average output of input are %d%n:",average);

	System.out.printf("Product output of input are %d%n:",product);
	


	

	}
}