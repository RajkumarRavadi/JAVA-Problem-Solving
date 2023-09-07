import java.util.*;
public class printing_pattern4_opt
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
		for(int row=1; row<=n*2-1; row++)
		{
		    if(row<=n)
		    {
		        for(int col=1; col<=row; col++)
		        {
		            System.out.print("* ");
		        }
		        System.out.println();
		    }
		    
		    if(row>n)
		    {
		        for(int col=1; col<=2*n-row; col++)
		        {
		            System.out.print("* ");
		        }
		        System.out.println();
		    }
		}
	}
}
