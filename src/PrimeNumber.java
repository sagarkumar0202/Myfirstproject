import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter lower Limit:");
		int l = sca.nextInt();

		System.out.println("Enter Upper Limit:");
		int u = sca.nextInt();
		int c;

		for (int i = l; i <= u; i++) {
			if (i == 1 || i == 0)
				continue;
			c = 1;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					c = 0;
					break;
				}
			}
			if (c == 1) {
				System.out.print(i + " ");
			}
		}
		sca.close();
	}

}
