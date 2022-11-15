import java.util.Arrays;
import java.util.Scanner;

public class FindMax {
    public static void main(String[]args){
        Scanner no = new Scanner(System.in);
        System.out.print("How many integers you want to enter: ");
        int none;
        none = no.nextInt();

       int seeOut = Q2(none);
        System.out.println(seeOut);

        }

    public static int Q2(int fm) {
        int[] num;
        Scanner scanner = new Scanner(System.in);


        num = new int[fm];
        for (int i = 0; i < fm; i++) {
            System.out.println("Enter integer "+ (i + 1) + ": ");
            if (scanner.hasNextInt()) {
                num[i] = scanner.nextInt();
            }
        }
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        System.out.print("The maximum value in the array is : ");

        return num[fm-1];
    }


}
