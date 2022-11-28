import java.util.Scanner;

public class Jurnal01 {

	public static void main(final String[] args) {
		Scanner in = new Scanner(System.in);

		double n = in.nextInt(),r = in.nextInt();
		
		
		while (r > 0 ) {
			n = n / 2;
			r = r - 10;
		}

		System.out.println(n);
		in.close();
	}
}
