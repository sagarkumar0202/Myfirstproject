import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);
		System.out.println("Enter any Number:");
		int n = sca.nextInt();
		int c = 0, sum = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				c = c + 1;
				sum = sum + i;
				System.out.println(i + " ");

			}sca.close();
			
		}
		// sum = c + i;

		System.out.println("Frequency of given number:" + sum);
	}
}
