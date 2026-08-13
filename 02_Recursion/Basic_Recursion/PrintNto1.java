public class PrintNto1 {
    public static void printnto1(int i, int n){
        if(i < 1){
            return;
        }
            System.out.println(i);
            printnto1(i - 1, n);
    }
    public static void main(String[] args) {
        int i = 5;
        int n = 5;
        printnto1(i, n);
    }
}

