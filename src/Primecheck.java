import java.util.Scanner;

public class Primecheck {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);
		System.out.println("Enter any Number:");
		int n = sca.nextInt();
		int c = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				c = c + 1;
				// System.out.println(i + " ");

			}
		}
		if (c == 2) {
			System.out.println("Its a prime number");
		} else {
			System.out.println("Its composite number");
		}
		sca.close();
	}
}
