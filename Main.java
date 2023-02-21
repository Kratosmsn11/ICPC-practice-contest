import java.util.*;

public class Main {

    public static void main(String[] args) {
        int numOfEle;

        ArrayList<String> Ele = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        numOfEle = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        StringBuilder ab = new StringBuilder();
        StringBuilder ac = new StringBuilder();



        if (numOfEle == 0) {
            System.out.println("0:0:EMPTY");
        } else {

            for (int i = 0; i < numOfEle; i++) {
                Ele.add(sc.next());
            }

            double perm = Math.pow(2, numOfEle);

            for (int i = 0; i < perm; i++) {
                String temp = Integer.toBinaryString(i);
                while (temp.length() != numOfEle) {
                    temp = 0 + temp;
                }
                if (i == 0) {
                    sb.append(i + ":" + temp + ":" + "EMPTY");

                } else {
                    sb.append("\n" + i + ":" + temp + ":");
                }

                for (int j = 0; j < temp.length(); j++) {
                    if (temp.charAt(j) == '1') {
                        sb.append(Ele.get(j) + " ");
                    }
                }
            }

        }
        String result = sb.toString();
        System.out.println(result.trim());
    }
}