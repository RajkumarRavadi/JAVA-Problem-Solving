import java.util.*;
public class Whichangle_triangele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        
        
        int RHS = a*a+b*b+c*c;
        int largestNumber=0;
        if(a>b && a>c){
            largestNumber = a;
        }
        else if (b>a && b>c){
            largestNumber = b;
        }
        else if (c>a && c>b){
            largestNumber = c;
        }
		//int largestNumber = Math.max(a,Math.max(b,c));
        int LHS = largestNumber*largestNumber*2;
        if(LHS==RHS){
            System.out.println("Right Angled");
        }
        else if (LHS<RHS){
            System.out.println("Acute Angle");
        }
        else if (LHS > RHS){
            System.out.println("Obtuce Angle");
        }
    }
	
}