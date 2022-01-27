import java.util.Arrays;

public class ReverseUsingStack {
    public static void main(String[] args) {
        int[] a = {11,12,13,14,15};
        ArrayStack<Integer> s = new ArrayStack<>(a.length);
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            s.push(a[i]);
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = s.pop();
        }
        System.out.println("The Array after reverse with stack");
        System.out.println(Arrays.toString(a));
    }
}
