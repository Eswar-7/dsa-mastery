public class Palindrome {
    public static void main(String[] args) {
        int n = 7789;
        int revnum = 0;
        int dup = n;
        while(n > 0){
            int lastdig = n%10;
            n = n/10;
            revnum = revnum * 10 + lastdig;
        }
        if(dup == revnum){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}