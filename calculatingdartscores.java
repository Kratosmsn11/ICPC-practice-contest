import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class calculatingdartscores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int c = sc.nextInt();

        ArrayList<Integer> queue = new ArrayList<Integer>(); // cashier's vector to keep a check on who is the fastest to finish up billing
        ArrayList<Integer> result = new ArrayList<Integer>(); // result vector to store the results

        // this loop is to intake the first n time that cashiers take
        for (int i = 0; i < n; i++) {
            result.add(i+1);           // adding the first n cashiers, will always be 1, 2, 3
            queue.add(sc.nextInt());
        }

        // this loop is to find the min time and do the same as above for the rest of the input times
        for (int i = 0; i < (c-n); i++) {
            int temp = Collections.min(queue);                 // checking for minimum time that the cashiers take
            result.add(queue.indexOf(temp)+1);                 // adding the times c - n cashiers
            queue.set(queue.indexOf(temp), temp+sc.nextInt());
        }

        // just for printing
        for (int i = 0; i < c; i++) {
            System.out.print(result.get(i) + " ");
        }

    }
}