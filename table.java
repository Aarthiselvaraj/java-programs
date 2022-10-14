import java.util.*;
public class table 
{
	public static void main(String[] args) 
	{
		int a,b,i,t;
		Scanner as=new Scanner(System.in);
		System.out.println("Enter the 1st and 2nd number");
		if(!as.hasNextInt())
		{
			System.out.println("Invalid");
			return;
		}
		a=as.nextInt();
		if(!as.hasNextInt())
		{
			System.out.println("Invalid");
			return;
		}
		b=as.nextInt();
		if(a<=0 && b<=0)
		{
		    System.out.println("INVALID");
		}
		else
		{
		    for(i=1;i<=10;i++)
		    {
		        t=a*i;
		        System.out.println(a +"*" +i+"=" +t);
		    }
		    for(i=1;i<=10;i++)
		    {
		        t=b*i;
		        System.out.println(b +"*" +i+"="+t);
		    }
		    
		}
		        
	}
}






   