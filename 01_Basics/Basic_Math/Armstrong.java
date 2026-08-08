public class Armstrong {
    public static void main(String[] args) {
        int n = 371;
        int dup = n;
       int sum = 0;
       int revnum = 0;
        while(n > 0 ){
           int  lastdig = n%10;
            sum = sum + (lastdig*lastdig*lastdig);
            n = n/10;
             revnum = revnum*10 + lastdig;
        }
        if(dup == sum){
            System.out.println("Armstrong number");
        }else{
            System.out.println("Not a Armstrong number");
        }

    }
}
