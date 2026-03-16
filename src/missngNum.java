public class missngNum {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,7,8,9};
        missing(arr);
    }

    public static void missing(int[] missArr){
        int sum = 0;
        for(int i=0; i<missArr.length; i++){
            sum += missArr[i];
        }
        //System.out.println(sum);

        int nSum = 0;
        for(int i=0; i<=missArr.length+1; i++){
            nSum += i;
        }
        int missing = nSum - sum;
        System.out.println(missing);
    }
}
