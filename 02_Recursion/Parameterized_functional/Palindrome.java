import java.util.Scanner;

public class Palindrome {
    public static boolean checkpalindrome(String str, int left, int right){
        if(left >= right){
            return true;
        }
        if(str.charAt(left) != str.charAt(right)){
            return false;
        }
        return checkpalindrome(str, left + 1, right - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();
        boolean result = checkpalindrome(str, 0 , str.length() - 1);
        if(result){
            System.out.println("Panlindrome");
        }else{
        System.out.println("Not a Panlindrome");
        }
    }
}
