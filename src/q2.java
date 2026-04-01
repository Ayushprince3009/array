public class q2 {
    public static void main(String[] args) {
        int[] arr = {1,23,45,76,89,34,54,23,65};
        rev(arr);
        print(arr);
    }
    public static void rev(int[] arr){
        int i = 0;
        int j = arr.length - 1;
        while(i<j){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;

            i++;
            j--;
        }
    }

    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele + " ");
        }
    }
}
