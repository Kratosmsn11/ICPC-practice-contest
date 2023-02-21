import java.util.Scanner;

public class dividingByTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int op= 0;

        while (A != B){
            if (A < B){
                A++;
                op++;
            }else {
                if(A % 2 == 0){
                    A = A/2;
                    op++;
                }else if (A % 2 == 1) {
                    A++;
                    op++;
                }
            }
        }

        System.out.println(op);
    }
}