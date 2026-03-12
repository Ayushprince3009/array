public class pro {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        res(arr);
    }
    public static void res(int[] x){
        int result =1;
        for(int i=0; i<x.length; i++){
            result *= x[i];
        }
        System.out.println(result);
    }
}
