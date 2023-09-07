import java.util.*;
public class printing_pattern2
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value : ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
		    for(int j=i; j<=n; j++)
		    {
		        System.out.print("* ");
		    }
		    System.out.println();
		}
	}
}
