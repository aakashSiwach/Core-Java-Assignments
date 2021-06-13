import java.util.*;
public class CheckEvenOdd {
    public static void main(String [] args)
    {
        Scanner scan=new Scanner(System.in); 
        System.out.print("Enter the integer number: ");
        int num = scan.nextInt();
        switch(num%2){//this will return either 0 or 1
        case 0:
            System.out.println(num+" is a Even number");
            break;
        case 1:
            System.out.println(num+" is a Odd number");
        }
    }
}
