import java.util.*;
public class checkPalindrome {
    public static void main(String [] args)
    {
        int r,sum=0,temp;    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();  
        temp=n;    
        while(n>0)
        {    
         r=n%10;  //getting remainder  
         sum=(sum*10)+r;    
         n=n/10;    
        }    
        if(temp==sum)  
        {  
             System.out.println(" is palindrome number ");    
        }
        else
        {    
            System.out.println(" is not palindrome");
        }
    }
}
