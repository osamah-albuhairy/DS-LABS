import java.util.Scanner;

public class ArrayPrint {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Number "+(i+1)+" : ");
            System.out.println(arr[i]);
        }


    }
}
