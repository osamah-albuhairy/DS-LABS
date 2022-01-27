import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperation2 {
    int[] x;
    int numOfElements;
    public ArrayOperation2() {
        x = new int[5];
        numOfElements = 0 ;
    }
    public int add(int e){
        if (numOfElements < x.length){
            x[numOfElements] = e;
            numOfElements++;
            return 0;
        }
        else{
            return -1;
        }
    }

    public static void main(String[] args) {
        ArrayOperation2 test = new ArrayOperation2();
        Scanner input = new Scanner(System.in);
        System.out.println("Input Elements :");

        for (int i = 0; i < 10; i++) {
            if (test.add(input.nextInt()) == 0){
                System.out.println("Added Successfully");
            }
            else {
                System.out.println("Error (The array is full)");
            }
            System.out.println(Arrays.toString(test.x));
        }
    }
}
