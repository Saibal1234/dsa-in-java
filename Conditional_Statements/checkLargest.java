import java.util.*;

public class checkLargest{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if(A>B && A>C){
            System.out.println("A is the largest no");
        }
        else if(B>C && B>A){
         System.out.println("B is the largest no");
        }
        else if(C>A && C>B){
            System.out.println("c is the largest no");
        }
        else{
            System.out.println("All are equal");
        }
    }
}