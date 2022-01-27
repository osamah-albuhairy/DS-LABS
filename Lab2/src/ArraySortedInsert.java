import java.util.Arrays;
import java.util.Scanner;

public class ArraySortedInsert {
    int x[];
    int numOfElements;

    public ArraySortedInsert() {
        x = new int[5];
        numOfElements = 0 ;
    }
    public int sortedAdd(int e){
        //insertion sort
        if (numOfElements<x.length){
            int i = numOfElements;
            while (i>0 && e<x[i-1]){
                x[i] = x[i-1];
                i--;
            }
            x[i] = e;
            numOfElements++;
            return 0;
        }
        return -1;
    }
    public int delete (){
        if (numOfElements > 0){
            x[numOfElements-1] = -1;
            numOfElements--;
            return 0;
        }
        return -1;
    }
    public static void main(String[] args) {
        ArraySortedInsert test = new ArraySortedInsert();
        Scanner input = new Scanner(System.in);
        System.out.println("Input Elements :");

        for (int i = 0; i < 6; i++) {
            if (test.sortedAdd(input.nextInt()) == 0){
                System.out.println("Sorted added Successfully");
            }
            else {
                System.out.println("Error (The array is full)");
            }
            System.out.println(Arrays.toString(test.x));
        }
        for (int i = 0; i < 6; i++){
            if (test.delete() == 0){
                System.out.println("Deleted success");
            }
            else {
                System.out.println("array is empy");
            }
            System.out.println(Arrays.toString(test.x));
        }
    }
}
