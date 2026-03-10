public class minEle {

    //print minimum elment from the given array

    public static void main(String[] args) {
        int[] arr ={3,67,34,89,1,32,34,55,78,9,2,11,16};
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
