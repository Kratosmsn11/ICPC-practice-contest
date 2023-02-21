import java.util.ArrayList;
import java.util.Scanner;

public class checkerBoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int [][] grid = new int[r][c];

        ArrayList<Integer> Arr1 = new ArrayList<>();
        ArrayList<Integer> Arr2 = new ArrayList<>();

        for (int i = 0; i <a ; i++) {
            Arr1.add(sc.nextInt());
        }

        for (int i = 0; i <b ; i++) {
            Arr2.add(sc.nextInt());
        }


    }
}