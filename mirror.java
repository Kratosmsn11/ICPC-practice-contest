import java.util.Scanner;

public class mirror {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int rows = sc.nextInt();
            sc.nextLine();
            String[] order = new String[rows];
            int index = 0;
            while (rows > 0) {
                StringBuffer line1 = new StringBuffer(sc.nextLine());
                String line2 = line1.reverse().toString();
                order[index] = line2;
                index++;
                rows--;
            }
            System.out.println("Test " + i);
            for (int j = order.length - 1; j >= 0; j--)
                System.out.println(order[j]);
        }
    }
}