
public class PrintName {
    public static void printname(String name, int n){
        if(n <= 0){
            return;
        }else{
            System.out.println(name);
            printname(name, n - 1);
        }
    }
        public static void main(String[] args){
            String name = "Eswar";
            int n = 5;
            printname(name,n);
        }
    }
