public class largestEleArray {
    public static void main(String[] args) {
        int[] arr = {12,15,43,23,34,55,39,20};
//        int result = largest(arr);
//        System.out.println(result);
        largest(arr);
    }

    public static void largest(int[] arr){
        int large = arr[0];
        int index = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i] > large){
                large = arr[i];
                index = i;
            }
        }
        System.out.println("Largest element is " + large + " at index " + index);
    }

//    public static int largest(int[] arr){
//        int large = arr[0];
//        for(int i=1; i<arr.length; i++){
//            if(arr[i] > large){
//                large = arr[i];
//            }
//        }
//        return large;
//    }
}
