import java.util.*;

public class leap_or_not 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt(); // Read the year input from the user
        // Check if the year is divisible by 4
        if (year % 4 == 0) 
        {
            // If divisible by 100, further check for divisibility by 400
            if (year % 100 == 0) 
            {
                if (year % 400 == 0) 
                {
                    System.out.println("Leap Year"); // Leap year
                } else 
                {
                    System.out.println("Not A Leap Year"); // Not a leap year
                }
            } else 
            {
                System.out.println("Leap Year"); // Leap year
            }
        } 
        else 
        {
            System.out.println("Not A Leap Year"); // Not a leap year
        }
    }
}
