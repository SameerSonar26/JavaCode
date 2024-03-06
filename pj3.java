public class pj3 // Rectangle
{
public static void main(String[] args)
{
	int i,j,k,row=6;
	
	for(i=0;i<row;i++)// Run all loop
	{	
		for(j=2*(row-i);j>0;j--) //Run for space
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
