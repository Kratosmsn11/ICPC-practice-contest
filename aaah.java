import java.util.Scanner;

public class aaah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        if(s1.length() >= s2.length())
            System.out.println("go");
        else
            System.out.println("no");
    }
}