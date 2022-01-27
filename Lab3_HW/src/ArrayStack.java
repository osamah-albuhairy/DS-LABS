import java.util.Arrays;

public class ArrayStack<E> implements Stack<E> {

    E data[];
    int t = -1;
    static final int CAPACITY = 100;

    public ArrayStack(int c) {
        data = (E[])new Object[c];
    }

    public ArrayStack() {
        this(CAPACITY);
    }

    @Override
    public boolean isEmpty() {
        return t==-1;
    }

    @Override
    public int size() {
        return t+1;
    }

    @Override
    public void push(E element) {
        if (size()==data.length)
            throw new IllegalStateException("Stack is Full");
        data[++t] = element;
    }

    @Override
    public E pop() {
        if (isEmpty()){
            System.out.println("The Stack is Empty");
            return null;
        }
        E deleted = data[t];
        data[t] = null;
        t--;
        return deleted;
    }

    @Override
    public E top() {
        if (isEmpty())return null;
        return data[t];
    }

    public void transfer(ArrayStack<E> x , ArrayStack<E> y){
        System.out.println("Stack 1 Elements : "+ Arrays.toString(x.data));
        System.out.println("Stack 2 Elements : "+ Arrays.toString(y.data));
        int counter = x.size()-1;

        for (int i = 0; i < x.size(); i++) {
            E temp = x.data[i];
            x.data[i] = y.data[counter];
            y.data[counter] = temp;
            counter--;
        }
        System.out.println("Transfered Stack 1 Elements : "+ Arrays.toString(x.data));
        System.out.println("Transfered Stack 2 Elements : "+ Arrays.toString(y.data));

    }




















    public void printStack(){
        String line1 = "",line2 = "",line3 = "";
        if (!isEmpty()){
            line1 = "╔═════╦";
            line2 = "║  "+data[0] + "  ║";
            line3 = "╚═════╩";
            for (int i = 1; i < size(); i++) {
                line1+= "═════╦";
                line2+= "  "+data[i] + "  ║";
                line3+= "═════╩";
            }
            System.out.println(line1+"════");
            System.out.println(line2);
            System.out.println(line3+"════");



        }
        else {
            System.out.println("╔══════");
            System.out.println("║");
            System.out.println("╚══════");
        }
    }
}
