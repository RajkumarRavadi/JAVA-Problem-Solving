import java.util.*;
public class operational_code {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number :");
        int b = sc.nextInt();
        System.out.print("Enter opcode: ");
        int opcode = sc.nextInt();
        sc.close();
        if(opcode==1)
        {
            System.out.println(a+b);
        }
        else if (opcode == 2)
        {
            System.out.println(a-b);
        }
        else if(opcode == 3)
        {
            System.out.println(a*b);
        }
        else if(opcode == 4)
        {
            if(b==0)
            {
                System.out.println("Zero division not possible");
            }
            else
            {
                System.out.println(a/b);
            }
        }
    }
}