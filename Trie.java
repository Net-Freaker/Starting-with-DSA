import java.util.*;
public class Trie { 
    Node root;
    public Trie()
    {
        root=new Node();
    }
    
        public class Node
     {
        Node[] children;
        boolean isWord;
    
        public Node()
        {
            this.children=new Node[26];
            this.isWord=false;

        }
     }
    
    public boolean insert(String word)
    {
        if(word==null || word.isEmpty())
        {
            throw new IllegalArgumentException("word is null");
        }
        word=word.toLowerCase();
        Node current=root;
        for(int i=0;i<word.length();i++)
        {
            char c=word.charAt(i);
            //System.out.println();
            int index=c-'a';
            if(current.children[index]==null)
            {
                Node temp=new Node();
                current.children[index]=temp;
                current=temp;

            }
            else
                current=current.children[index];
            
            
        }
        return current.isWord=true;
    }
    


    public boolean search(String word)
    {
        word=word.toLowerCase();
        Node temp=root;
        for(int i=0;i<word.length();i++)
        {
            char c=word.charAt(i);
            int index=c-'a';
            if(temp.children[index]==null)
            {
                return false;
            }
            else{
                temp=temp.children[index];
            }

        }
        return temp.isWord==true;
    }
    public static void main(String[] args) {
        Trie tr=new Trie();
        tr.insert("hanu");
        tr.insert("Ram");
        tr.insert("hub");
        if(tr.search("han")==true)
        {
            System.out.println("Present:");
        }
        else{
            System.out.println("Nt present");
        }
        System.out.println("Succesfully insertedA!!");
        
    }
}