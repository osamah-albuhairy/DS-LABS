import java.util.Scanner;

public class ArrayInputAndPrint {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Number "+(i+1)+" : ");
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Number "+(i+1)+" : ");
            System.out.println(arr[i]);
        }
    }
}
