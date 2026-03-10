public class arrayneg {


    //print negative elements of an array


    public static void main(String[] args) {
        int[] arr = {1,3,6,-1,33,-78,9,-123,-1,56,-99,91};
        for(int i=0; i<arr.length; i++){
            if(arr[i]<0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
