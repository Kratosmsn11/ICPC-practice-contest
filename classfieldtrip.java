import java.util.Scanner;

class classfieldtrip {
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        String str = str1 + str2;

        char arr[] = str.toCharArray();

        char temp;

        int i = 0;
        while (i < arr.length) {
            int j = i + 1;
            while (j < arr.length) {
                if (arr[j] < arr[i]) {

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j += 1;
            }
            i += 1;
        }

        System.out.println(arr);
    }
}
