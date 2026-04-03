public class frequencyChaarInt {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,1,2,3,1,2,1,3,45,1,2,5,61,31,34,1356,1231,1};
        int target = 1;
        int count= 0;
        for(int num:arr){
            if(num == 1){
                count++;
            }
        }
        System.out.println(count);
    }
}
