package Stack;
import java.net.SocketTimeoutException;
import java.util.*;
public class Stacks 
{
    public static void main(String[] args) 
    {
        Scanner o = new Scanner(System.in);
        System.out.print("Stack Implementation using Array: ");
        boolean flag = true;
        System.out.print("Enter the stack size: ");
        int sz = o.nextInt();
        Stacks stc = new Stacks(sz);
        while (flag) 
        {
            System.out.println("1] Push an Element");
            System.out.println("2] Pop an Element");
            System.out.println("3] Display");
            System.out.println("4] Exit");  
            System.out.println("Select an option from above ");
            int ch = o.nextInt();
            
            switch (ch) {
                case 1: System.out.println("Enter the element to push");
                    int e = o.nextInt();

                    break;
            
                default:
                    break;
            }
        }
        o.close();
    }
}
