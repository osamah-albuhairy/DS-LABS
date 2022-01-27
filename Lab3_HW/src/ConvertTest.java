import java.util.Arrays;
import java.util.Scanner;

public class ConvertTest extends Convert{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the mathmetics (NO WHITE SPACE):");
        String operation = input.nextLine();

        String inPrefix = toPrefix(operation);
        System.out.println("Prefix : ["+inPrefix+"]");
        getPrefixResult(inPrefix);
    }



}
