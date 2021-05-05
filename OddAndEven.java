import java.util.Scanner;
public class OddAndEven{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	int firstinteger;


	System.out.println("Enter the integer here: ");
	firstinteger = input.nextInt();

	if(firstinteger%2 == 0)
	System.out.printf("%d is even number %n", firstinteger);
	if(firstinteger%2 != 0)
	System.out.printf("%d is odd number %n", firstinteger);
	}
}