import java.util.ArrayList;
import java.util.Scanner;

public class shiritori {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        ArrayList<String> words = new ArrayList<>();

        words.add(sc.nextLine());

        System.out.println(words);
        for (int i = 1; i < n; i++) {
            String add = sc.nextLine();
            if(words.contains(add) || words.get(i).charAt(0) == words.get(i-1).charAt(words.get(i-1).length()-1)){
                if(i%2 == 0){
                    System.out.println("Player 1 lost");
                }
                else {
                    System.out.println("Player 2 lost");
                }
            }
            else {

                System.out.println("Fair Game");
            }
            words.add(add);
        }
    }
}
