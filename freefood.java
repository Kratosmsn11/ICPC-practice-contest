import java.util.Scanner;

public class freefood {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = new int[365];

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int t = sc.nextInt();
            for (int j = s-1; j <= t-1 ; j++) {
                arr[j] = 1;
            }
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) sum++;
        }
        System.out.println(sum);
    }
}
