import java.util.ArrayList;
import java.util.Scanner;

public class oddgnome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        ArrayList<String[]> s_arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] a = s.trim().split("\\s+");
            s_arr.add(a);
        }

        for (int i = 0; i < n; i++) {
            String []a = s_arr.get(i);
            for (int j = 1; j < a.length; j++) {
                if(Integer.parseInt(a[j+1]) - Integer.parseInt(a[j]) != 1){
                    System.out.println(j+1);
                    break;
                }
            }
        }
    }
}