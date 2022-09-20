import java.util.Scanner;

public class loworderzeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int a = sc.nextInt();
            if(a == 0) break;
            else {
                double[] dig = new double[1000001];
                for (int i = 1; i < 1000001; i++) {
                    dig[i] = Math.log10(i) + dig[i - 1];
                }
                dig[0] = 1;
                dig[1] = 1;
                System.out.println(dig[4]);
            }
        }
    }

}
