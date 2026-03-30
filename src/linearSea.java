public class linearSea {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14,16};
        int key = 98;
        int res = linear(arr, key);
        if(res == -1){
            System.out.println("Not found");
        }
        else{
            System.out.println("Found at index"+" "+res);
        }

    }

//    public static void linear(int[] x, int a){
//        for(int i=0; i<x.length; i++){
//            if(x[i] == a){
//                System.out.println("found at index"+" "+ i);
//                break;
//            }    ////DONT USE THIS APPROACH
//            else{
//                System.out.println("Not found");
//            }
//        }
//    }

    public static int linear(int[] x, int a){
        for(int i=0; i<x.length; i++){
            if(x[i] == a){
                return i;
            }
        }
        return -1;
    }
}
