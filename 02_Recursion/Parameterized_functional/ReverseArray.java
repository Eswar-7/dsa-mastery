import java.util.*;
public class ReverseArray {
    public static int[] reverse(int[] arr, int left, int right){
        if(left >= right){
            return arr;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        return reverse(arr, left + 1, right -1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int result [] = reverse(arr, 0, arr.length - 1);
        System.out.println("Reversed array");
        for(int i = 0; i < arr.length; i++){
            System.out.print(result[i]+ " ");
        }
    }
}
