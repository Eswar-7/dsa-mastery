import java.util.*;

public class Sequences{
    public static void  printsequences(int index, ArrayList <Integer> list, int arr [], int n){
        if(index >= n){
                System.out.println(list);
                return ;
        }
        list.add(arr[index]);
        printsequences(index + 1, list, arr , n);

        list.remove(list.size() - 1);
        printsequences(index + 1, list, arr , n);
    }
    public static void main(String[] args) {
        int arr[] = {1,2};
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        printsequences(0, list, arr, n);
    }
}