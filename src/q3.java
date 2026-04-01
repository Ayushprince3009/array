public class q3 {
    public static void main(String[] args) {
        int[] arr = {1,23,45,76,89,34,54,23,65};
        int key = 23;
        int res = search(arr, key);

        if(res == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found");
        }

    }
    public static int search(int[] arr, int key){
        for(int i=0; i<arr.length-1;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;

    }
}
