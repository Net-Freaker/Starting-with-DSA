//@SupressWarnings("unchecked")
//import java.util.Map;
import java.util.HashMap;
import java.util.*;
import java.util.Arrays;
public class Twosumproblem{
    public int[] twosum(int[] arr,int target){
        int[] result=new int[2];
       // Map m=new HashMap();
       HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<6;i++){
            if(!map.containsKey(target-arr[i])){
                map.put(arr[i],i);
                
            }
            else{
                result[1]=i;
                result[0]=map.get(target-arr[i]);
                return result;
            }
          
            
        }
          throw new IllegalArgumentException("not possible");
        
    }
    public static void main(String args[]){
        Twosumproblem t1=new Twosumproblem();
        int[] arr={2,11,5,10,7,8};
       // int[] result=t1.twosum(arr,9);
        //System.out.println("Result are:"+result[0]+"and"+result[1]);
        System.out.println(Arrays.toString(t1.twosum(arr,9)));
    }
}