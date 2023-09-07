import java.util.*;

public class Reverse_digits_of_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s="";
		//Write your code here
        if(n==0)
        {
            s="0";
        }
        else
        {
           while(n>0)
		    {
		        int last_digit=n%10;
		        s=s+String.valueOf(last_digit);
		        n=n/10;
		    }
        }
		
		//System.out.println(s);
		int reverse_number = Integer.parseInt(s);
		System.out.println(reverse_number);
    }
}