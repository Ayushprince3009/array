public class missingEle {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,3,8,7,9,11,10};

        //missing ele = 3


        int n = arr.length + 1;
        int sum = 0;
        for(int i =0; i<arr.length; i++){
            sum += arr[i];
        }
        int sumArr = 0;
        for(int i=1; i<=n; i++){
            sumArr += i;
        }
        int missingEle = sumArr - sum;

        System.out.println(missingEle);
    }
}
