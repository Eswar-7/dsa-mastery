import java.util.*;
public class Fibonacci {
    public static int fibonum(int n){
        if(n <= 1){
            return n ;
        }
        int lastnum = fibonum(n -1);
        int seconlastnum = fibonum( n -2);
        return lastnum + seconlastnum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonum(n));
    }
    
}
