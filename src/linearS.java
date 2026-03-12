public class linearS {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int key = 15;
        boolean found = false;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Element found");
        }
        else{
            System.out.println("Element not found");
        }
    }
}
