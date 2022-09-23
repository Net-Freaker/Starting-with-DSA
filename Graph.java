import java.util.*;
public class Graph{
    int[][] matrix;
    int E;
    int V;
    Scanner sc = new Scanner(System.in);
    public Graph(int nodes)
    {
        this.matrix=new int[nodes][nodes];
        this.V=V;
    }
    public void addedge(int u,int v){
        matrix[u][v]=1;
        matrix[v][u]=1;
        E++;
        
    }
    public void printmatrix(){
        for(int[] r:matrix){
            for(int x:r)
            {
                System.out.print(x+" ");
            }
            System.out.println(" ");


        }

        }
        public void addedgesbetween()
        {
            
        
        
        System.out.println("Enter no.of edges:");
       
        int ed=sc.nextInt();
        System.out.println("Edges"+ed);
        //System.out.println("Enter ");
        for(int i=0;i<ed;i++)
        {
            System.out.println("Enter the edges between vertices i.e;u,v");
            int u=sc.nextInt();
            int v=sc.nextInt();
            addedge(u, v);

        }
        
        }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the matrix size");
        int n=sc.nextInt();
        Graph g=new Graph(n);
        g.addedgesbetween();
          
        System.out.println("Vertices:"+n);
        g.printmatrix();


    }
}