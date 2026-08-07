public class ReverseNum {
    public static void main(String[] args) {
        int n = 7789;
        int revnum = 0;
        while(n > 0){
            int lastdig = n%10;
            n = n/10; 
            revnum = revnum*10 + lastdig;
        }
        System.out.println(revnum);
    }
    
}
