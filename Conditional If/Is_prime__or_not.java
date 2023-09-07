import java.util.*;
public class Is_prime__or_not
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count=0;
		if(n>0)
		{
		    for(int i=2; i<n; i++)
		    {
		        if(n % i == 0)
		        {
		            count = count+1;
		        }
		        
		    }
		    if(count==0)
		    {
		        System.out.println(n+" is a prime number");
		    }
		    else if (count>0)
		    {
		        System.out.println(n+" is not a prime number");
		    }
		}
	}
}
