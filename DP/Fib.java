//Bottom up approach



public class Fib {
    public int fibb(int n)
    {
        int[] table=new int[n+1];
        table[0]=0;
        table[1]=1;
        for(int i=2;i<=n;i++){
            table[i]=table[i-1]+table[i-2];
        }
        return table[n];
    }
    public static void main(String[] args) {
        Fib f=new Fib();
        System.out.print(f.fibb(10));
    }
    
}
