class PatternKiteABC
{
	public static void main(String args[])
	{
		//int i,j,k;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=(5-i)+1;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i)-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2*(5-i+1)-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}