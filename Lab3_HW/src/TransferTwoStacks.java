import java.util.Scanner;

public class TransferTwoStacks {
    public static void main(String[] args) {
        ArrayStack<Integer> s = new ArrayStack<>(5);
        ArrayStack<Integer> t = new ArrayStack<>(5);

        Scanner input = new Scanner(System.in);
        s.push(11);
        s.push(22);
        s.push(33);
        s.push(44);
        s.push(55);


        t.push(66);
        t.push(77);
        t.push(88);
        t.push(99);
        t.push(00);


        s.transfer(s,t);

    }
}
