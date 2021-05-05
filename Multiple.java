import java.util.Scanner;
public class Multiple{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the first number");
	int firstnumber = input.nextInt();
	System.out.println("Enter the second number");
	int secondnumber = input.nextInt();

	if(firstnumber%secondnumber == 0)
	System.out.printf("%d is a multiple of %d%n", firstnumber, secondnumber);

	if(firstnumber%secondnumber != 0)
	System.out.printf("%d is not a multiple of %d%n", firstnumber, secondnumber);
	}
}