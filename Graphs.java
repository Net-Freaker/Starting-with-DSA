import java.util.LinkedList;
import java.util.Queue;

//import javax.xml.crypto.NodeSetData;
@SuppressWarnings("unchecked")


public class Graphs {

    private LinkedList<Integer>[] a;
    int V;
    int E;
    public Graphs(int nodes){
       this.V=nodes;
       this.E=0;
       this.a=new LinkedList[nodes];
       for(int i=0;i<V;i++)
       
       {
        a[i]=new LinkedList<>();
       }    
    }
    public void addedge(int u,int v){
        a[u].add(v);
        a[v].add(u);
        E++;

    }
    public void printlist(int nodes)
    {   
        System.out.println("Vertices are"+nodes+"Edges are:"+E);
        for(int i=0;i<nodes;i++)
        {
            System.out.print("Vertice "+i+":");
            System.out.print(a[i]);
            System.out.println(" ");
        }
    }
    public void bfs(int s)
    {
        boolean[] visited=new boolean[V];
        Queue<Integer> q=new LinkedList<>();
        visited[s]=true;
        q.offer(s);
        while(!q.isEmpty())
        {
            int sa=q.poll();
            System.out.print(sa+" ");
            for(int b:a[sa])
            {
                if(!visited[b])
                {
                    visited[b]=true;
                    q.offer(b);
                }
            }

        }


    }
    public static void main(String[] args) {
        Graphs g = new Graphs(5);
        g.addedge(0, 1);
        g.addedge(1, 2);
        g.addedge(2, 3);
        g.addedge(3, 0);
        g.addedge(2, 4);
        g.printlist(4);
       //g.bfs(0);


    }
}

