import java.util.Scanner;

public class checkEqual {
    public static void main (String [] arh)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Integer");
        int a = sc.nextInt();
        System.out.println("Enter second Integer");
        int b = sc.nextInt();
       /*
        Boolean res;
        res= (a==b);
        System.out.println("a equal to b: "+res);
        res= (a==c);
        */  if(a==b)
        {
            System.out.println(a+" equal to "+b); 
        }
        else{
            System.out.println(a+" is not equal to "+b);
        }
    }
    
}


