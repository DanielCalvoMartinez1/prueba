import java.util.Scanner;

class Challenge {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the 1st number:");
		int num1 = scanner.nextInt();
		System.out.println("Enter the 2nd number:");
		int num2 = scanner.nextInt();
		int resultado = num1 * num2;
		System.out.println("The product of the two numbers is: " + resultado);
	}
}