import java.util.Arrays;

public class ArrayOperation {
    public static void main(String[] args) {
        int [] a = {20,30,40,50,60};
        System.out.println(Arrays.toString(a));
        System.out.println("Array after reverse : ");
        System.out.println(Arrays.toString(reverse(a)));


    }
    public static int[] reverse(int[] x){
        int n = x.length-1;
        for (int i = 0; i < x.length/2; i++) {
            int temp = x[i];
            x[i] = x[n];
            x[n] = temp ;
            n--;
        }
        return x;
    }
}
