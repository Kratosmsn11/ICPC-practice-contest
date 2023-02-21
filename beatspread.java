import java.util.Scanner;

public class beatspread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = 0;
        while(i<n){
            int s = sc.nextInt();
            int d = sc.nextInt();
            int a = (s+d)/2;
            int b = a - d;
            if(a*2 == s+d && b>=0) System.out.println(a+" "+b);
            else System.out.println("Impossible");

            i++;
        }
    }
}