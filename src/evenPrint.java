public class evenPrint {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7,8,9,10,12,14,13,16};
        evenarr(arr);
    }

    public static void evenarr(int[] arr){
        for(int num:arr){
            if(num % 2 == 0){
                System.out.print(num + " ");
            }
        }
    }
}
