import java.util.Scanner;

public class Jurnal03 {

	public static void main(final String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int ratusan = a / 100 % 10;
		int puluhan = a / 10 % 10;
		int satuan = a % 10;
		int depan = ratusan;
		int tengah = puluhan;
		int belakang = satuan;

		while (ratusan > 1) {
			depan = depan * (--ratusan);
		}
		while (puluhan > 1) {
			tengah = tengah * (--puluhan);
		}
		while (satuan > 1) {
			belakang = belakang * (--satuan);
		}

		if (a == (depan + tengah + belakang)) {
			System.out.println("YA");
		} else {
			System.out.println("BUKAN");
		}
		input.close();

	}
}