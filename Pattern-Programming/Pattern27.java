class Pattern27
{
	public static void main(String args[])
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4-i;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(" "+k);
			}
			for(int l=1;l<=i-1;l++)
			{
				System.out.print(" "+(i-l));
			}
			System.out.println();
		}
	}
}