public class linearsear2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int key = 6;

        int res = linear(arr, key);

        if(res == -1){
            System.out.println("Key not found");
        }
        else{
            System.out.println("Key found at index " + res);
        }
    }

    public static int linear(int[] arr, int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
}
