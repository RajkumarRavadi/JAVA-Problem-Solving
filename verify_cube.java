import java.util.*;


public class verify_cube {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of A : ");
        long A = sc.nextLong();
        System.out.print("Enter value of B : ");
        long B = sc.nextLong();
        long LHS = (A+B)*(A+B)*(A+B);
        long RHS = (A*A*A)+(B*B*B)+(3*A*A*B)+(3*A*B*B);
        System.out.println(LHS);
        System.out.println(RHS);
        if(LHS==RHS){
            System.out.println("VERIFIED");
        }
        else{
            System.out.println("NOT VERIFIED");
        }
    }
}
