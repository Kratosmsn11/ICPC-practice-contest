import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class abc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            arr.add(sc.nextInt());
        }
        Collections.sort(arr);

        char[] c = sc.next().toCharArray();
        for (int i = 0; i < 3; i++) {
            System.out.print(arr.get(c[i] - 'A') + " ");
        }

    }
}
