import java.util.Scanner;

public class TP03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = 0;

        int b = 1;

        while (b != 0) {
            b = in.nextInt();
            a = a + b; 
        }

        in.close();

        System.out.println(a);
    
    }
}
