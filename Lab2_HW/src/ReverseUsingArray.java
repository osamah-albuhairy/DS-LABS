import java.util.Arrays;

public class ReverseUsingArray {
    public static void main(String[] args) {
        int [] a = {20,30,40,50,60};
        System.out.println(Arrays.toString(a));
        System.out.println("Array after reverse : ");
        System.out.println(Arrays.toString(reverseUsingArray(a)));
    }
    public static int[] reverseUsingArray(int[] x){
        int [] y = new int[x.length];
        int counter = 0 ;
        for (int i = x.length-1; i > -1; i--) {
            y[counter] = x[i];
            counter++;
        }
        return y;
    }
}
