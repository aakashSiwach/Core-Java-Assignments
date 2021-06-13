import java.util.*;
public class largestNumber 
{
    public static void main(String []args) 
    {
        Scanner cv = new Scanner(System.in);
        int i = cv.nextInt();
        int j = cv.nextInt();
        int k = cv.nextInt();
        cv.close();
        int x = (i > j && i > k) ? i : (j > k) ? j : k;
        System.out.println("Largetest Number : "+x);
    }
}
