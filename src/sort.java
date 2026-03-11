import java.util.Arrays;
public class sort {
    public static void main(String[] args) {

        // we are sorting array using bult-in

        int[] arr = {23,45,12,32,76,56,33,1,21};
        Arrays.sort(arr);
        print(arr);
    }
    public static void print(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
