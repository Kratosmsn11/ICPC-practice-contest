import java.util.Scanner;

public class commercials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, p, max = 0, prev_profit=0;
        n = sc.nextInt();
        p = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int curr_profit = sc.nextInt() - p;
            if(prev_profit > 0) prev_profit = prev_profit + curr_profit;
            else prev_profit = curr_profit;
            if(max < prev_profit) max = prev_profit;
        }
        System.out.println(max);
    }
}
