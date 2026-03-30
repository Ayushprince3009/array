public class kadans {
    public static void main(String[] args) {
//        int[] arr = {-5,-8,-3,-9,-6,-1,-10};
        int[] arr = {1,2,3,4,5,6,7};
        kadan(arr);
    }
   // this will be used when all the numbers will be negative in array
    public static void kadan(int[] arr){
        int cs = arr[0];
        int ms = arr[0];

        for(int i=1; i<arr.length; i++){
            cs = Math.max(arr[i], cs+arr[i]);
            ms = Math.max(cs, ms);
        }
        System.out.println(ms);
    }
}

