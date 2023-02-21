import java.util.Scanner;

public class evenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n == 1 || n%2 == 1){
            System.out.println("Either");
        }else{
            int temp = (n*(n+1))/2;
            if(temp % 2 == 0){
                System.out.println("Even");
            }else{
                System.out.println("Odd");
            }
        }

    }
}