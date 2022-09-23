import java.lang.reflect.GenericDeclaration;
import java.util.*;
import java.util.Arrays;
public class Island{
    int[][] grid={{1,1,0,0},{1,0,0,0},{0,0,1,0},{0,0,0,1}};
    public int dfs(int[][] grid)
    {
        int m=grid.length;
        int n=grid[0].length;
        boolean[][] visited=new boolean[m][n];
        int count=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
 
                if(!visited[i][j] && grid[i][j]==1)
                {
                    dfs(grid,i,j,visited);
                    count++;
                }
            }
        }
        return count;
    } 
    public boolean isinbound(int row,int colomn)
    {
        if(row<grid.length &&colomn<grid[0].length &&row>0 && colomn>0 )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void dfs(int[][] grid,int row,int colomn,boolean[][] visited)
    {
        if(row<0 || colomn<0 || grid[row][colomn]==0 || visited[row][colomn] || row>=grid.length ||colomn>=grid[0].length )
        {
            return;
        }
        if(isinbound(row, colomn))
        {
        visited[row][colomn]=true;
        
        
        
        dfs(grid,row,colomn-1,visited);
        dfs(grid,row-1,colomn,visited);
        dfs(grid,row,colomn+1,visited);
        dfs(grid,row+1,colomn,visited); 
        }      
    }   


   
    public static void main(String[] args) {
        Island ig=new Island();

        System.out.println(Arrays.deepToString(ig.grid));
        System.out.println(ig.grid[0].length);
        System.out.println(" Total no of lands are:"+ig.dfs(ig.grid));
    }
}