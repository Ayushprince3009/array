public class insertArray{
    public static void main(String[] args) {
        int[] arr = new int[10];
        int size = 5;
        arr[0] = 1;
        arr[1]= 2;
        arr[2]= 3;
        arr[3]= 4;
        arr[4]= 5;
// Insert at last position
        int n = 20;
        arr[5] = n;
        size++;

        for(int num: arr){
            System.out.print(num+" ");
        }

    }
}