public class MaxsubArray{
    static int maxxSub(int[] arr){
        int currentsum=arr[0];
        int maxsofar=arr[0];
        for(int i=1;i<arr.length;i++){
          /*   currentsum=currentsum+arr[i];//add element into existing subarray
            if(currentsum<arr[i]){//or
                currentsum=arr[i];//create its own subarray,Whatever it is max it will select that
            }*/
            currentsum=Math.max(currentsum+arr[i], arr[i]);
            if(maxsofar<currentsum){
                maxsofar=currentsum;
            }
        }
        return maxsofar;

    }
    public static void main(String[] args) {
        int[] arr={4,3,-2,6,-12,7,-1,6};
        System.out.print(maxxSub(arr));
    }
}
