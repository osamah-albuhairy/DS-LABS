import java.util.Scanner;

public class ArrayMethods {

    public static void inputArray(int []y){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < y.length; i++) {
            System.out.print("Number "+(i+1)+" : ");
            y[i] = input.nextInt();
        }
    }
    public static void displayArray(int []x){
        for (int i = 0; i < x.length; i++) {
            System.out.print("Number "+(i+1)+" : ");
            System.out.println(x[i]);
        }
    }


    public static void main(String[] args) {
        int arr[] = new int[5];
        inputArray(arr);
        displayArray(arr);
    }

}
