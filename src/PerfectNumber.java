
import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);
		System.out.println("Enter any Number:");
		int n = sca.nextInt();
		int c = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				c = c + i;

			}
		}
		if (c == n) {
			System.out.println("is a perfact number:");
		} else {

			System.out.println("not a perfect  number:");
		}
		sca.close();
	}

}
