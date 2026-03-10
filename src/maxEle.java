public class maxEle {

    //maximum element in the array

    public static void main(String[] args) {
        int[] arr = {2,4,8,9,11,45,67,22,34,11,234,56,89,98,90};
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.print(max);
    }
}
