import java.util.Scanner;

public class somesum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0, temp = n;

        for (int i = 0; i < n; i++) {
            sum += temp;
            temp -= 1;
        }

        if(n%2 == 1){
            System.out.println("Either");
        }else if(sum%2 == 0){
            System.out.println("Even");
        }else if(sum%2 == 1){
            System.out.println("Odd");
        }
    }
}