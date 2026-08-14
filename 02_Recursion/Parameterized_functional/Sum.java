import java.util.*;
public class Sum {
    public static void printsum (int i, int sum){
        if(i < 1){
            System.out.print(sum);
            return;
        }
        printsum(i - 1, sum + i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        printsum(n, 0);
    }
}

