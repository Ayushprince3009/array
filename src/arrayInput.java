import java.util.*;
public class arrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
 // array input code
        for(int i=0; i<arr.length; i++){
            System.out.println("Enter number:");
            int x = sc.nextInt();
            arr[i] = x;
        }
  //array printing code
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
