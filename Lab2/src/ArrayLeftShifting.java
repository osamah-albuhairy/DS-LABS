import java.util.Arrays;

public class ArrayLeftShifting {
    public static void main(String[] args) {
        int [] a = {20,30,40,50,60};
        System.out.println(Arrays.toString(a));
        System.out.println("Array after left Shifting : ");
        System.out.println(Arrays.toString(shiftLeft(a)));
    }
    public static int[] shiftLeft(int[] x){
        int f_element = x[0];
        for (int i = 0; i < x.length-1; i++) {
            x[i] = x[i+1];
        }
        int n = x.length-1;
        x[x.length-1] = f_element;
        return x;
    }
}