public class q1 {
    public static void main(String[] args) {
        int[] arr = {1,23,45,76,89,34,54,23,65,445,55,69,123,4312};
        int res = largest(arr);
        System.out.println(res);

    }

    public static int largest(int[] arr){
        int lar = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>lar){
                lar = arr[i];
            }
        }
        return lar;
    }
}
