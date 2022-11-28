import java.util.Scanner;

/**
 * TP01
 */
public class TP01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int amoeba = 30;

        int menit = 0;

        in.close();
        
        while (amoeba < n) {
            menit += 15;
            amoeba *= 2;
        }
        System.out.println(menit);
    }
}