import java.util.Scanner;

public class sum_of_digits_of_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        
        while(n>0)
        {
            int last_digit = n%10;
            sum=sum+last_digit;
            n = n/10;
        }
        System.out.println(sum);
    }
}
