public class pj4 // Pyramid Star Pattern
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
	
	
		
		
	}

}
