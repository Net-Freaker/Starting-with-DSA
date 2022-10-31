import java.util.Stack;

public class Binary{
   TreeNodee    root;
    
    public class TreeNodee{
        int data;
        TreeNodee left;
        TreeNodee right;

        TreeNodee(int data){
            this.data=data;
        

        }

    }
    public void createTreeNode()
    {
        root=new TreeNodee(5);
        TreeNodee second=new TreeNodee(7);
        TreeNodee third=new TreeNodee(8);
        TreeNodee fourth=new TreeNodee(0);
        TreeNodee fifth=new TreeNodee(9);
        TreeNodee first=root;
        first.left=second;
        first.right=third;
        second.left=fourth;
        second.right=fifth;

    }
    public void preorder(TreeNodee root)
    {
        if(root==null)
        {
           
            return;
          

        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);



    }
    public void preorderiterative(TreeNodee root)
    {
        if(root==null)
        {
            return;
        }
        Stack<TreeNodee> stack =new Stack<>();
        stack.push(root);
        while(!stack.isEmpty())
        {
            TreeNodee temp=stack.pop();
            System.out.println(temp.data);
            if(temp.right!=null)
            {
            
            stack.push(temp.right);
            }
            if(temp.left!=null){
            stack.push(temp.left);
            }


        }

    }
    public void inorder(TreeNodee root)
    {
        if(root==null)
        {
            return ;

        }
        inorder(root.left);
        System.out.println(root.data);
    //    inorder(root);
        inorder(root.right);

    }
    public void inorderiterative(TreeNodee root)
    {
        if(root==null)
        {
            return;
        }
        Stack<TreeNodee> stack=new Stack<>();
       // stack.push(root);
        TreeNodee temp=root;
        while(!stack.isEmpty()|| temp!=null)
        {
           
            if(temp!=null){
                stack.push(temp);
                temp=temp.left;

            }else{
             temp=stack.pop();
             System.out.println(temp.data);
             temp=temp.right;
            }
            

            
    }




    }
    public void postorderrecursive(TreeNodee root)
    {
        if(root==null)
        {
            return;
        }
        else{
            postorderrecursive(root.left);
            postorderrecursive(root.right);
            System.out.println(root.data);
        }
    }
    public int biggest()
    {   
        return biggest(root);

    }
    public int biggest(TreeNodee root)
    {
        if(root==null){
            return Integer.MIN_VALUE;
        }
        int result=root.data;
        int left=biggest(root.left);
        int right=biggest(root.right);
        if(left>result)
        {
            result=left;
        }
        if(right>result) 
        {
            result=right;
           // System.out.println(result);

        }
        
        return result;

        


    }


    public static void main(String[] args) {
        Binary b=new Binary();
        b.createTreeNode();
     // b.preorder(b.root);
     //  b.preorderiterative(b.root);
     //b.inorderiterative(b.root);
    // b.postorderrecursive(b.root);
     System.out.print(b.biggest());
    }

    

    
}