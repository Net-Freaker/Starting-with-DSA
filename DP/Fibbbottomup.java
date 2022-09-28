import java.util.*;
public class Fibbbottomup {
    static int fibb(int[] memo,int n){
        if(memo[n]==0){
            if(n<2){
                memo[n]=n;
            }
            else{
                int left=fibb(memo, n-1);
                int right=fibb(memo, n-2);
                memo[n]=left+right;
            }
            
        }
        return memo[n];
    }
    public static void main(String[] args) {
        Fibbbottomup fbb=new Fibbbottomup();
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter number:");
        int n=sc.nextInt(); 
        int[] memo=new int[n+1];
        System.out.print(fibb(memo, n));
        
        
    }
    
    
}
