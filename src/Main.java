import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main extends sort {
    public static void main(String[] args) {
        //input data
        Scanner s = new Scanner(System.in);
        Scanner p = new Scanner(System.in);
        System.out.print("How many numbers do you want to sort : ");
        int n = s.nextInt();
        System.out.print("Enter your array : ");
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = p.nextInt();
        }
        //bubble sort
        sortNum(num);
        //print
        for (int i = 0; i < n; i++) {
            System.out.print(num[i] + " ");
        }
    }
}