public class QuickSort {
    static void print(int[] arr){
        for(int i:arr){
            System.out.println(i);
        
        }
    }
    static int partition(int[] arr,int low,int high){
        int i=low;
        int j=low;
        int pivot=high;
        while(i<=high){
            if(arr[i]<=arr[pivot]){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                j++;
            }
            i++;
        }
        return j-1;
    }
    static void QuickSort(int[] arr,int low,int high){
        if(low<high){
            int p=partition(arr, low, high);
            QuickSort(arr, low, p-1);
            QuickSort(arr, p+1, high);
        }
    }
    public static void main(String[] args) {
       int[] arr={9,3,4,1,45};
       int low=0;
       int high=arr.length-1;
        QuickSort(arr, low, high);
        print(arr);
    }
    
}
