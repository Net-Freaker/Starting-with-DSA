//Sum of three to a target in a ascending order
import java.util.Arrays;
class Sumofthree {
    static void Target(int[] arr,int target){
        Arrays.sort(arr);
        for(int i=0;i<arr.length-2;i++){
            int j=i+1;
            int k=arr.length-1;
            while(j<k){
                int sum=arr[i]+arr[j]+arr[k];
                if(sum==target){
                    System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    j++;
                    k--;
                }
                else if(sum<target){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] arr={4,2,9,6,3,1,0,7};
        Target(arr,6);
    }
}