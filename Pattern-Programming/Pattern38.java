class Pattern38
{
	public static void main(String args[])
	{
		char ch='A';
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5-i+1;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i)-1;j++)
			{
				if(j==1||j==(2*i)-1)
				System.out.print((char)(ch+5-i));
				else
				System.out.print(" ");
			}
			System.out.println();
		}
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i+1;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(2*(5-i))-1;j++)
			{
				if(j==1||j==(2*(5-i))-1)
				System.out.print((char)(ch+i));
				else
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}