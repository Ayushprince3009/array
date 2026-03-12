import java.util.*;
public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int i=3;
        int j = 5;   //yaha i aur j ka value dene se specific range ka araay reverse hoga baki saME RHEGA

        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for(int ele : arr){
            System.out.print(ele +" ");
        }
    }
}
