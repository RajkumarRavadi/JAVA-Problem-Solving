import java.util.*;
public class printing_pattern_1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of lines: ");
		int a =  sc.nextInt();
		System.out.print("Enter the number of stars for each line: ");
		int b =  sc.nextInt();
		
		for(int i=1; i<=a; i++)
		{
		    for(int j=1; j<=b; j++)
		    {
		        System.out.print("* ");
		    }
		    System.out.println();
		}
	}
}
