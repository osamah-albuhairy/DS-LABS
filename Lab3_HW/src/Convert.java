public class Convert {
    public static String toPrefix(String x){
        ArrayStack<Character> myStack = new ArrayStack<>(10);
        int operation_length = x.length();
        int counter = 0 ;
        String prefix = "";
        char deleted = ' ';
        while (counter < operation_length){
            char token = x.charAt(counter);
            if (token == '('){
                System.out.println("current TOKEN :["+x.charAt(counter) + "]");
                myStack.push(token);
                System.out.println("Output : " + prefix);
                myStack.printStack();
                System.out.println("=======================================");
            }
            else if(token == ')'){
                System.out.println("current TOKEN :["+x.charAt(counter) + "]");
                while (deleted != '('){
                    deleted = myStack.pop();
                    System.out.println("Output : " + prefix);
                    myStack.printStack();
                    System.out.println("=======================================");
                    if (deleted != '('){
                        prefix += deleted;
                        System.out.println("Output : " + prefix);
                        myStack.printStack();
                        System.out.println("=======================================");
                    }
                }
                deleted = ' ';
            }
            else if(token == '+' || token == '*' || token == '-' || token == '/'){
                System.out.println("current TOKEN :["+x.charAt(counter) + "]");
                myStack.push(token);
                System.out.println("Output : " + prefix);
                myStack.printStack();
                System.out.println("=======================================");
            }
            else {
                System.out.println("current TOKEN :["+x.charAt(counter) + "]");
                prefix += token;
                System.out.println("Output : " + prefix);
                myStack.printStack();
                System.out.println("=======================================");
            }
            counter++;
        }
        while (!myStack.isEmpty()){
            deleted = myStack.pop();
            prefix += deleted;
            System.out.println("Output : " + prefix);
            myStack.printStack();
            System.out.println("=======================================");
        }
        return prefix;
    }

    public static int getPrefixResult(String pre){
        ArrayStack<Character> myStack = new ArrayStack<>(10);
        int operation_length = pre.length();
        int counter = 0 ;
        int op1 = 0,op2 = 0;
        char op;



        while (counter < operation_length){
            char token = pre.charAt(counter);
            if(token == '+' || token == '*' || token == '-' || token == '/'){
                System.out.println("current TOKEN :["+pre.charAt(counter) + "]");
                op2 = Integer.parseInt(String.valueOf(myStack.pop()));
                op1 = Integer.parseInt(String.valueOf(myStack.pop()));
                if (token == '+'){
                    int result = op1+op2;
                    System.out.println(op1+" + "+op2+" = "+result);
                    myStack.push((char)(result+'0'));
                    myStack.printStack();
                }
                else if(token =='-'){
                    int result = op1-op2;
                    System.out.println(op1+" - "+op2+" = "+result);
                    myStack.push((char)(result+'0'));
                    myStack.printStack();
                }
                else if (token =='*'){
                    int result = op1*op2;
                    System.out.println(op1+" * "+op2+" = "+result);
                    myStack.push((char)(result+'0'));
                    myStack.printStack();
                }
                else if (token == '/'){
                    int result = op1/op2;
                    System.out.println(op1+" / "+op2+" = "+result);
                    myStack.push((char)(result+'0'));
                    myStack.printStack();
                }

                System.out.println("=======================================");
            }
            else {
                System.out.println("current TOKEN :["+pre.charAt(counter) + "]");
                myStack.push(token);
                myStack.printStack();
                System.out.println("=======================================");
            }

            counter++;
        }
        while (!myStack.isEmpty()){
            System.out.println("Final result = "+myStack.pop());
        }






        return 1;
    }
}
