import java.util.Scanner;

public class Task2 {

	public static int divRec(int x) {
		if (x > 1) {
			System.out.println(x);
			divRec(x/2);
		}
		return x;
	}

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		int number;

		System.out.print("Enter number:");
		number = kbd.nextInt();
		kbd.nextLine();

		divRec(number);

	}

}
