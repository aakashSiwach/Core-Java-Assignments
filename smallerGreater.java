import java.util.Scanner;

public class smallerGreater {
    public static void main(String []args) 
    {
        Scanner cv = new Scanner(System.in);
        int i = cv.nextInt();
        int j = cv.nextInt();
        int k = cv.nextInt();
        int x = (i > j && i > k) ? i : (j > k) ? j : k;
        int y = (i < j && i < k) ? i : (j < k) ? j : k;
        System.out.println("Largetest Number : "+x);
        System.out.println("Smallest Number : "+y);
    }
}
