class pyramid
{
	public static void main(String args[])
	{
		int n1=Integer.parseInt(args[0]);
		int i,j;
		for(i=1;i<=n1;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
