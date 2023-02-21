import java.util.ArrayList;
import java.util.Scanner;

public class blackAndWhite {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int n = Integer.parseInt(sc.next()); // input size

        ArrayList<String> rows = new ArrayList<>(); // to store rows as strings

        for (int i = 0; i < n; i++) {
            rows.add(sc.next());
        }

        // checking for rows
        int bs = 0, ws = 0, countW = 0, countB = 0;

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if(rows.get(i).charAt(j) == 'B'){
                    countB++;
                    if(countB >= 3){
                        System.out.println(0);
                        System.exit(0);
                    }else{
                        bs++;
                        countW = 0;
                    }
                }
                else{
                    countW++;
                    if(countW >= 3){
                        System.out.println(0);
                        System.exit(0);
                    }else{
                        ws++;
                        countB = 0;
                    }
                }
            }
            countW = 0; countB = 0;
            if (bs == ws){
                continue;
            }else {
                System.out.println(0);
                System.exit(0);
            }

        }

        // checking for columns
        bs = 0; ws = 0; countW = 0; countB = 0;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if(rows.get(j).charAt(i) == 'B'){
                    countB++;
                    if(countB >= 3){
                        System.out.println(0);
                        System.exit(0);
                    }else{
                        bs++;
                        countW = 0;
                    }
                }
                else{
                    countW++;
                    if(countW >= 3){
                        System.out.println(0);
                        System.exit(0);
                    }else{
                        ws++;
                        countB = 0;
                    }
                }
            }
            countW = 0; countB = 0;
            if (bs == ws){
                continue;
            }else {
                System.out.println(0);
                System.exit(0);
            }
        }

        System.out.println(1);
    }
}
