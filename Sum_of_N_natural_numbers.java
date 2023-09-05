import java.util.Scanner;

public class Sum_of_N_natural_numbers 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long sum=0;
        for(long i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
