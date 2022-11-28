import java.util.Scanner;

public class Jurnal02 {

	public static void main(final String[] args) {
		Scanner in = new Scanner(System.in);
		float a = 0;
		int b = 1;
		int jumlah = 0;
		
		while (b != 0) {
			b = in.nextInt();
			a = a + b; 

			jumlah += 1;
		}

		System.out.printf("%.2f",a /(jumlah - 1));

		in.close();
	}
}
