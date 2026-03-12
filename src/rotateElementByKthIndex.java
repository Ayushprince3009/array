public class rotateElementByKthIndex {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        //output ----  7,8,9,1,2,3,4,5,6

        //hardcode method generally dont use this

        int r = 5;
        int start = 0;
        int end = r;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        int i = r+1;
        int j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        int k =0;
        int m = arr.length -1;
        while(k<m){
            int temp = arr[k];
            arr[k]=arr[m];
            arr[m]=temp;
            k++;
            m--;
        }
        for(int ele: arr){
            System.out.print(ele+" ");
        }

    }
}
