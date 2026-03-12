public class searchLinear {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9};
        int key = 5;
        result(arr,key);
    }
    public static void result(int[] ele, int a){
        for(int i=0; i<ele.length; i++){
            if(ele[i] == a){
                System.out.println("found at index:"+i);
                return;
            }
        }
        System.out.println("Not found");
    }
}
