import java.util.Scanner;

class Findelements
{  
	public static void main(String args[])
	{
		Scanner as = new Scanner(System.in);
		
	        int i,n,large;
		
		System.out.println("Enter the number of elements:") ;
 		n = as.nextInt();
		int[] a = new int[n];
 
    		System.out.println("Enter the elements") ;
    		for(i=0;i<n;i++)
    		{
        		a[i] = as.nextInt();
    		}
		
		large = a[0];		   		
		for(i=1;i<n;i++)
	    	{
			if(large<a[i])
        		{
				large = a[i];
			}
    		}
    		
		System.out.println("Largest of "+n+" elements in an array = "+large);
	}
}   
