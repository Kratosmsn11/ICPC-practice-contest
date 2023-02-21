import java.util.Scanner;

public class lineup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int dec=0, inc=0;
        String previous = sc.nextLine();
        for (int i = 0; i < n-1; i++) {
            String next = sc.nextLine();
            int a = previous.compareTo(next);
            previous=next;
            if(a>=0) dec++;
            else inc++;
        }

        if(dec != 0 && inc == 0) System.out.println("DECREASING");
        else if (dec == 0 && inc != 0) System.out.println("INCREASING");
        else System.out.println("NEITHER");
    }
}