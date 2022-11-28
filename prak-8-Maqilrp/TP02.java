import java.util.Scanner;

public class TP02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int b = 0;

        in.close();
        
        while (n != 0) {
            b = b * 10;
            b = b + n % 10;
            n = n /10;
        }

        System.out.println(b);
    }
}
