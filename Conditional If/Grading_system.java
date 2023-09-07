import java.util.*;
public class Grading_system {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        sc.close();
       // Your code here
       
       if (n>0 && n<=100){
       
       if (n>90){
           System.out.println("Excellent");
       }
       else if(n>80 && n<=90){
           System.out.println("Good");
       }
       else if(n>70 && n<=80){
           System.out.println("Fair");
       }
       else if(n>60 && n<=70){
           System.out.println("Meets Expectations");
       }
       else if(n<=60 && n>0)
       {
           System.out.println("Below Expectations");
       }
    }
    else{
        System.out.println("Marks are in between 1-100 only.");
    }
}
}