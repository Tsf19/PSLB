class Pattern6
{
	public static void main(String args[])
	{
		for(int i=1;i<=7;i++)
		{
			for(int j=7;j>=7-i+1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}