public class missngNum {
    public static void main(String[] args) {
        int[] arr = {1,7,4,2,3,6,8,9};
        missing(arr);
    }

    public static void missing(int[] missArr){
        int sum = 0;
        for(int i=0; i<missArr.length; i++){
            sum += missArr[i];
        }
        //System.out.println(sum);

//        int nSum = 0;
//        for(int i=0; i<=missArr.length+1; i++){
//            nSum += i;
//        }
//        int missing = nSum - sum;
//        System.out.println(missing);

        int n = missArr.length + 1;
        int nSum = n*(n+1)/2;

        int missing = nSum - sum;
        System.out.println(missing);
    }
}
