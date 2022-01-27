import java.util.Scanner;

public class StackTest {

    public static void main(String[] args) {
        ArrayStack<Integer> myStack = new ArrayStack<>(20);
        Scanner input = new Scanner(System.in);
        boolean keep = true;
        int element ;
        char c = ' ';
        while (keep){
            System.out.println("What do you want to do ? ");
            System.out.println("1-PUSH     2-POP     3-TOP     4-SIZE     5-PRINT    0-EXIT ");
            c = input.next().charAt(0);

            switch (c){
                case '1':
                    System.out.println("Enter a single digit to push ");
                    element = input.nextInt();
                    myStack.push(element);
                    myStack.printStack();
                    break;
                case '2':
                    myStack.pop();
                    myStack.printStack();
                    break;
                case '3':
                    System.out.println("The top Element is : "+myStack.top());
                    break;
                case '4':
                    System.out.println("The size of the stack is : "+myStack.size());
                    break;
                case '5':
                    myStack.printStack();
                    break;
                case '0':
                    keep = false;
                    break;
            }
        }
    }
}
