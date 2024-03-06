public class pj5 // Diamond Shape Pattern
{
public static void main(String[] args)
{
	int i,j,k,row=6;
	
	for(i=0;i<row;i++)// Run all loop
	{	
		for(j=row-1;j>i;j--) //Run for space
		{
		System.out.print(" ");
		}
		
		for(k=0;k<=i;k++) // Run for #
		{
		System.out.print(" #");
		}
		System.out.println();
	}
		for(i=0;i<row;i++)// Run all loop
	{	
		for(j=0;j<=i;j++) //Run for space
		{
		System.out.print(" ");
		}
		
		for(k=row-1;k>i;k--) // Run for #
		{
		System.out.print(" #");
		}
		System.out.println();
	
		
		
	}
}
}
