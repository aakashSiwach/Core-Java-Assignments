class function 
{

	public static void main(String[] yrgs)
	{
		  int res=0;
	      res = add(50,100);
		  System.out.println(res);
	      res = sub(50,100);
		  System.out.println(res);
	      res = mul(10,90);
		  System.out.println(res);
	      res = div(2,10);
		  System.out.println(res);
	}

	 public static int add(int y,int x)
	{
		return y+x;
	}
	public static int sub(int y,int x)
	{
		return y-x;
	}
	public static int mul(int y,int x)
	{
		return y*x;
	}
	public static int div(int y,int x)
	{
		return y/x;
	}

}