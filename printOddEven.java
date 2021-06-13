public class printOddEven 
{
    public static void main (String [] args) 
    {   
        for(int i = 10;i<=20;i++)
        {
            if(i%2==0)
            {
                System.out.println("      "+i+" is Even Number");
            }
            if(i%2!=0)
            {
                System.out.print(i+" is odd number");
            }
        }
    }
}
