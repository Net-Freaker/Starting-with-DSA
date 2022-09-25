
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Stack;
@SuppressWarnings("unchecked")
public class Graaphs{
    static LinkedList<Integer>[] li;
    Graaphs(int size)
    {
        this.li=new LinkedList[size];
        for(int i=0;i<size;i++)
        {
            li[i]=new LinkedList<>();

        }

    }
    public void inserrtedge(int u,int v)
    {
        this.li[u].add(v);
        this.li[v].add(u);
    }
    public void insertnotlinked(int u,int v)
    {
        this.li[u].add(v);
        

    }
    /*public void printt(int ele )
    {
        boolean[] visited=new boolean[4];
        Stack<Integer> stack=new Stack<>();
        stack.push(ele);
        while(!stack.isEmpty())
        {
            int temp=stack.pop();
            System.out.println(temp);
            if(!visited[temp])
            {
            visited[temp]=true;
            }
           
            for(int i:li[temp])
            {
                if(!visited[i])
                {
                    visited[i]=true;
                    stack.push(i);
                }
            }
            
        

            
        }
    }
        /*public void printlist(int nodes)
    {   
       // System.out.println("Vertices are"+nodes+"Edges are:"+E);
        for(int i=0;i<nodes;i++)
        {
            System.out.print("Vertice "+i+":");
            System.out.print(li[i]);
            System.out.println(" ");
        }


       
    }*/
    public void dfs(int nodes)
    {
        boolean[] visited= new boolean[li.length];
        for(int i=0;i<nodes;i++)
        {
            if(!visited[i])
            {
                
                dfs(i,visited);
            }
        }

    }
    public void dfs(int ele,boolean[] visited)
    {
        
        
            visited[ele]=true;
            System.out.println(ele);
            for(int b:li[ele])

            {   if(!visited[b])
               // System.out.println(b);
                dfs(b,visited);
            }
        
    }
    public static void main(String[] args) {
        Graaphs gr=new Graaphs(6);
        gr.inserrtedge(0, 1);
        gr.inserrtedge(1, 2);
        gr.inserrtedge(2, 3);
        gr.inserrtedge(3, 0);
       // gr.inserrtedge(4, );
        gr.insertnotlinked(4, 5);
        System.out.println("Succesfully added:");
       // gr.printt(3);
       gr.dfs(5);
    }
    

}