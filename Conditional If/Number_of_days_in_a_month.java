import java.util.*;
public class Number_of_days_in_a_month
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        
		if(M<=12 && M>0)
		{
		    if(M==1 || M==3 || M==5 || M==7 || M==8 || M==10 || M==12)
		    {
		        System.out.println(31);
		    }
		    else if (M==4 || M==6 || M==9 || M==11)
		    {
		        System.out.println(30);  
		    }
		    else if (M==2)
		    {
		        System.out.println(28);
		    }
		   
		}
		else
		{
		    System.out.println("Month sholud in between 1-12");
		}
        
    }
}
