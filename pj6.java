public class pj6{
public static void main(String[] args)
{
int i,j,k,row=6;
	for(i=0;i<row;i++)
	{
		for(j=0;j<=i;j++)
		{
		System.out.print(" ");
		}
		for(k=row;k>i;k--)
		{
			System.out.print(" #");
		}
		System.out.println();
	}
	for(i=0;i<row;i++)
	{
		for(j=row;j>i;j--)
		{
		System.out.print(" ");
		}
		for(k=0;k<=i;k++)
		{
			System.out.print(" #");
		}
		System.out.println();
}
}
}