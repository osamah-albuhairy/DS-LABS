import java.util.Arrays;

public class ArrayRightShifting {
    public static void main(String[] args) {
        int [] a = {20,30,40,50,60};
        System.out.println(Arrays.toString(a));
        System.out.println("Array after right Shifting : ");
        System.out.println(Arrays.toString(shiftRight(a)));
    }
    public static int[] shiftRight(int[] x){
        int l_element = x[x.length-1];
        for (int i = x.length-1; i > 0; i--) {
            x[i] = x[i-1];
        }
        x[0] = l_element;
        return x;
    }
}
