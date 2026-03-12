public class twoSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 105;
        //boolean found = false;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j] == target){
                    System.out.println("found at index"+" "+i+" "+"and index"+" "+j);
                    //found = true;
                    //break;
                    return;
                }
            }
        }
        System.out.println("Not found");

//        if(found){
//            System.out.println("found");
//        }
//        else{
//            System.out.println("Not found");
//        }
    }
}
