import java.util.*;
public class amstrong_or_not
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = n;
		int sum_of_cubes=0;
		
		while(n>0)
		{
		    int digit = n%10;
		    sum_of_cubes = sum_of_cubes+digit*digit*digit;
		    n = n/10;
	    }
	    
	    //System.out.println(n);
	    //System.out.println(num);
	    //System.out.println(sum_of_cubes);
	    
	    if(num==sum_of_cubes)
	    {
	        System.out.println(num+" is a amstrong number");
	    }
	    else
	    {
	        System.out.println(num+" is not a amstrong number");
	    }
	    
	}
}
