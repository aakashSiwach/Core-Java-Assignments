public class equalNotEqualLoop {
    public static void main (String [] args) {
        for(int i = 1;i<=20;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i+" is not Divisible by 2.     ");
            }
            if(i%5==0)
            {
                System.out.print(i+" Divisible by 5");
            }
        }
    }
}
