public class secondMax {
    public static void main(String[] args) {
        int[] arr = {2,31,51,51,19,19};
        int max = arr[0];

        // for finding maximum element of array
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        // for finding second max
        int sMax=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(sMax < arr[i] && arr[i] < max ){
                sMax = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(sMax);
    }
}
