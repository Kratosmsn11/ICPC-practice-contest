import java.util.Scanner;
import java.util.StringTokenizer;

public class prozor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] arr = new int[102][102];
        String [] str = new String[102];

        String nums = sc.nextLine();
        StringTokenizer st = new StringTokenizer(nums);
        int r = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        for (int i = 0; i < r; i++) {
            str[i] = sc.nextLine();
            for (int j = 0; j < s; j++) {
                if(str[i].charAt(j) == '*')
                    arr[i+1][j+1] = 1;
                else
                    arr[i+1][j+1] = 0;
            }
        }

        // calculating for the prefix sum
        for (int i = 1; i <= r; i++)
            for (int j = 1; j <= s; j++)
                arr[i][j] += arr[i][j-1] + arr[i-1][j] - arr[i-1][j-1];

        // finding the maximum desired block
        int max_i = k, max_j = k, cur_val = 0, max_val = 0;
        for (int i = k; i <= r; i++) {
            for (int j = k; j <= s; j++) {
                cur_val = arr[i-1][j-1] - arr[i-k+1][j-1] - arr[i-1][j-k+1] + arr[i-k+1][j-k+1];
                if(cur_val > max_val){
                    max_val = cur_val;
                    max_i = i;
                    max_j = j;
                }
            }
        }

        // printing the output
        System.out.println(max_val);
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= s; j++) {
                if ((i==max_i-k+1 && j==max_j-k+1)||(i==max_i && j==max_j-k+1)||(i==max_i-k+1 && j==max_j)||(i==max_i && j==max_j))
                    System.out.print("+");
                else if ((i==max_i-k+1 || i==max_i) && (j>max_j-k+1 && j<max_j))
                    System.out.print("-");
                else if ((j==max_j-k+1 || j==max_j) && (i>max_i-k+1 && i<max_i))
                    System.out.print("|");
                else
                    System.out.print(str[i-1].charAt(j-1));
            }
            System.out.println();
        }
    }
}