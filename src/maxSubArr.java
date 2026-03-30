public class maxSubArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        kadans(arr);
    }
    public static void kadans(int[] arr){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i=1; i<arr.length; i++){
            cs = cs + arr[i];

            if(cs < 0){
                cs = 0;
            }

            ms = Math.max(cs, ms);
        }

        System.out.println(ms);
    }
}
