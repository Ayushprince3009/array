public class arrayupdae {
    public static void main(String[] args) {
        int[] arr = {1,2,34,4,5,6,7,8,9,10,11};
        result(arr);
    }

    public static void result(int[] x){
        for(int i=0; i<x.length; i++){
            if(i%2 == 0){
                x[i] = x[i] + 10;
            }
            else{
                x[i] = 2*x[i];
            }
            System.out.print(x[i] + " ");
        }

//        for(int i=0; i<x.length; i++){
//            System.out.print(x[i]+" ");
//        }
//        System.out.println();
    }
}
