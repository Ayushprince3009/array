public class sumArray {

    //sum of elements of array

    public static void main(String[] args) {
        int[] arr = {2,6,1,9,7,2,11,23};
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.print(sum);
    }
}
