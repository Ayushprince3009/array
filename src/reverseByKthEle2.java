public class reverseByKthEle2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int k = 3;
        //ouput---5,6,7,8,9,1,2,3,4

        //not recommended

        int n = arr.length;
        int d = k+1;
        result(arr,0,n-1);
        result(arr,0,n-d-1);
        result(arr,n-d,n-1);
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
    public static void result(int[] x,int i,int j){
        while(i < j){
            int temp = x[i];
            x[i] = x[j];
            x[j] = temp;
            i++;
            j--;
        }

    }
}
