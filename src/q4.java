public class q4 {
    public static void main(String[] args) {
        int[] arr = {1,23,45,76,89,34,54,23,65};
        sum(arr);
    }
    public static void sum(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
