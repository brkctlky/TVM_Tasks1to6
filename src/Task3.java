
public class Task3 {

	public static void main(String[] args) {
		for (int i = 0; i <= 2; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i = 0; i <= 2; ++i) {
			System.out.print(i + " ");
		}
		System.out.println("\nAbove, ++i and i++ are making same operations!");
		System.out.println("However, we can see the difference between ++i and i++ on the below!");
		int i = 3;
		System.out.println("i = " + i);
		int a = i++; // a = 3, i = 4
		System.out.println("a = i++ means that a = " + a + " and i = " + i);
		int b = ++a; // b = 4, a = 4
		System.out.println("b = ++a means that b = " + b + " and a = " + a);
		System.out.println("++i and i++ are very similar but not exactly the same. Both increment "
				+ "\nthe number, but ++i increments the number before the current expression \nis evaluted, "
				+ "whereas i++ increments the number after the expression is evaluated.");
	}

}
