import java.util.Scanner;
public class ComparingInteger{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	int numb1;
	int numb2;

	System.out.println("Enter the first number: ");
	numb1 = input.nextInt();

	System.out.println("Enter the second number: ");
	numb2 = input.nextInt();

	if(numb1 == numb2)
	System.out.printf("This number is equal %d%n", numb1, numb2);
	
	if(numb1 != numb2)
	System.out.printf("this number not equal %d%n", numb1, numb2);

	if(numb1 < numb2)
	System.out.printf("This number is less than %d%n", numb1, numb2);

	if(numb1 > numb2)
	System.out.printf("This number is greater than %d%n", numb1, numb2);	
}
}