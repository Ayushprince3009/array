public class binarySear {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14};
        int key = 14;
        int result = binary(arr, key);
        System.out.println(result);
    }

    public static int binary(int[] arr, int key){
        int start = 0;
        int last = arr.length - 1;
        while(start <= last){
            int mid = (start + last) / 2 ;

            if(arr[mid] == key){   //found condition
                return mid;
            }

            if(arr[mid] < key){    //right side
                start = mid + 1;
            }

            else{        //left side
                last = mid - 1;
            }
        }

        return -1;       //when key is not found in array
    }
}
