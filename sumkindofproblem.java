import java.util.Scanner;

public class sumkindofproblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int P = sc.nextInt();
        for (int i = 0; i < P; i++) {
            int c = sc.nextInt();
            int n = sc.nextInt();

            int S1 = (n * (2 * 1 + (n -1)* 1))/2;
            int S2 = (n * (2 * 1 + (n -1)* 2))/2;
            int S3 = (n * (2 * 2 + (n -1)* 2))/2;

            System.out.println(c + " " + S1 + " " + S2 + " " + S3);
        }
    }
}