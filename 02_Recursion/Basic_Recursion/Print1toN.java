public class Print1toN {
    public static void print1ton(int i, int  n){
        if(i > n){
            return;
        }
        System.out.print(i);
        print1ton(i + 1, n);
    }
public static void main(String[] args){
    int i = 1;
    int n = 5;
    print1ton(i, n);
}
}

